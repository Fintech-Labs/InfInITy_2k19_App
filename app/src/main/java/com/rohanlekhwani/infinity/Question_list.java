package com.rohanlekhwani.infinity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Question_list extends BaseAdapter {
    LayoutInflater mInfalter;
    String[] year;
    String[] question_list;
    public Question_list(Context e,String[] q,String[] y)
    {
        question_list=q;
        year=y;
        mInfalter=(LayoutInflater)e.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return question_list.length;
    }

    @Override
    public Object getItem(int position) {
        return question_list[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=mInfalter.inflate(R.layout.question_list,null);
        TextView Question=(TextView)v.findViewById(R.id.question_name_view);
        TextView Year=(TextView)v.findViewById(R.id.yeartext);
        String Ques=question_list[position];
        String Yea=year[position];
        Question.setText(Ques);
        Year.setText(Yea);
        return v;
    }
}
