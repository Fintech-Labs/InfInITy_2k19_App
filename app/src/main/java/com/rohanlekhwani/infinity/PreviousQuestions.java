package com.rohanlekhwani.infinity;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PreviousQuestions extends AppCompatActivity {
    ListView question_list;
    String[] question_name;
    String[] year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previousquestions);
        Resources res=getResources();
        question_name=res.getStringArray(R.array.Questions_Name);
        year=res.getStringArray(R.array.Year);
        question_list=(ListView)findViewById(R.id.question_listview);
        Question_list itemadapter=new Question_list(this,question_name,year);
        question_list.setAdapter(itemadapter);
        question_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent question_detail=new Intent(getApplicationContext(),Question_Detail.class);
                 question_detail.putExtra("tk.kunalgohire.Question",position);
                 startActivity(question_detail);
            }
        });
    }
}