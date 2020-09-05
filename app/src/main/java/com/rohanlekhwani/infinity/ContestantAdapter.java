package com.rohanlekhwani.infinity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContestantAdapter extends RecyclerView.Adapter<ContestantAdapter.MyViewHolder> {

    private ArrayList<Contestant> contestantsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView rank, username, score;

        public MyViewHolder(View view) {
            super(view);
            rank = (TextView) view.findViewById(R.id.rank);
            username = (TextView) view.findViewById(R.id.username);
            score = (TextView) view.findViewById(R.id.score);
        }
    }


    public ContestantAdapter(ArrayList<Contestant> contestantsList) {
        this.contestantsList = contestantsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contestant_rank, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contestant contestant = contestantsList.get(position);
        holder.rank.setText(""+contestant.getRank());
        holder.username.setText(contestant.getUsername());
        holder.score.setText(""+contestant.getScore());
    }

    @Override
    public int getItemCount() {
        return contestantsList.size();
    }
}