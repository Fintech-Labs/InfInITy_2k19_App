package com.rohanlekhwani.infinity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(LogoActivity.this, MainActivity.class); startActivity(i);
                finish(); } }, 3000);
    }

}



