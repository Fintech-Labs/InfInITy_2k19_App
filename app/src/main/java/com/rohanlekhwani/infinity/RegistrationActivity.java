package com.rohanlekhwani.infinity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {

    EditText first, last, username, mobile, college, email;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        first = (EditText) findViewById(R.id.firstname);
        last = (EditText) findViewById(R.id.lastname);
        username = (EditText) findViewById(R.id.usernameregister);
        mobile = (EditText) findViewById(R.id.mobileregister);
        college = (EditText) findViewById(R.id.collegeregister);
        email = (EditText) findViewById(R.id.emailregister);

        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f,l,u,m,c,e;
                f = first.getText().toString().trim();
                l = last.getText().toString().trim();
                u = username.getText().toString().trim();
                m = mobile.getText().toString().trim();
                c = college.getText().toString().trim();
                e = email.getText().toString().trim();
                if(f.length() > 0 && l.length() > 0 && u.length() > 0 && m.length() > 0 && c.length() > 0 && e.length() > 0)
                {
                    databaseReference.child(u).child("name").setValue(f+" "+l);
                    databaseReference.child(u).child("mobile").setValue(m);
                    databaseReference.child(u).child("college").setValue(c);
                    databaseReference.child(u).child("email").setValue(e);

                    Toast.makeText(RegistrationActivity.this, "User Registered Successfully", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(RegistrationActivity.this, "One or more fields are incomplete!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
