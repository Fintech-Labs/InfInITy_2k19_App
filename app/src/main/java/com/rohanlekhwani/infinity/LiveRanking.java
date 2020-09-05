package com.rohanlekhwani.infinity;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LiveRanking extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContestantAdapter mAdapter;
    ArrayList<Contestant> userList_set = new ArrayList<>();
    Button global, india, iiitpune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_ranking);

        global = (Button) findViewById(R.id.global);
        india = (Button) findViewById(R.id.India);
        iiitpune = (Button) findViewById(R.id.IIITPune);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new ContestantAdapter(userList_set);
        recyclerView.setAdapter(mAdapter);

        String url = "https://www.codechef.com/api/rankings/OCT19B?sortBy=rank&order=asc&page=1&itemsPerPage=25";
        ranklist(url);

        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String url = "https://www.codechef.com/api/rankings/FFC22019?sortBy=rank&order=asc&page=1&itemsPerPage=25";
               ranklist(url);
            }
        });

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.codechef.com/api/rankings/FFC22019?sortBy=rank&order=asc&page=1&itemsPerPage=25&filterBy=Country%3DIndia";
                ranklist(url);
            }
        });

        iiitpune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.codechef.com/api/rankings/OCT19B?sortBy=rank&order=asc&page=1&itemsPerPage=25&filterBy=Institution%3DIndian%20Institute%20of%20Information%20Technology%2C%20Pune";
                ranklist(url);
            }
        });


    }

    protected void ranklist(String url)
    {
        //Clear Recycler View
        userList_set.clear();
        mAdapter.notifyDataSetChanged();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {

            Handler mainHandler = new Handler(Looper.getMainLooper());

            @Override
            public void onFailure(Call call, IOException e) {
                mainHandler.post(new Runnable() {

                    @Override
                    public void run() {

                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                mainHandler.post(new Runnable() {

                    @Override
                    public void run() {

                        if(response.isSuccessful()){
                            try {
                                final String CCResponse = response.body().string();
                                JSONObject CC = new JSONObject(CCResponse);
                                JSONArray CCList = CC.getJSONArray("list");


                                for(int i = 0;i<CCList.length();i++)
                                {
                                    Contestant userdata = new Contestant();
                                    JSONObject user = CCList.getJSONObject(i);
                                    userdata.setRank(user.getInt("rank"));
                                    userdata.setUsername(user.getString("user_handle"));
                                    userdata.setScore(user.getInt("score"));
                                    System.out.println(userdata.getUsername()+ " " + userdata.getScore());
                                    userList_set.add(userdata);
                                }
                                System.out.println("Executed");
                                mAdapter.notifyDataSetChanged();
//                        RankList item_adapter = new RankList(getBaseContext(),userList_set);
//                        if(user_data_list!= null)
//                            user_data_list.setAdapter(item_adapter);


                            }catch(JSONException e)
                            {
                                System.out.println(e.getMessage());
                            }
                            catch(IOException e)
                            {
                                System.out.println("IOException: "+e.getMessage());
                            }
                        }
                    }
                });
            }


        });
    }
}
