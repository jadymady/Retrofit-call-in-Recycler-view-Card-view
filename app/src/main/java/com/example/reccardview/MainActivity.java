package com.example.reccardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;
    String url="https://my-json-server.typicode.com/easygautam/data/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=findViewById(R.id.rcv);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        loadData();
        }

    private void loadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myapi api = retrofit.create(myapi.class);

        Call<ArrayList<Model>> call = api.getModels();

        call.enqueue(new Callback<ArrayList<Model>>() {
            @Override
            public void onResponse(Call<ArrayList<Model>> call, Response<ArrayList<Model>> response) {

                ArrayList<Model> data = response.body();
                adapter = new myadapter(data, MainActivity.this);
                rcv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Model>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "error=" + t.toString(),
                        Toast.LENGTH_LONG).show();

                Log.e("Retro Exception", t.toString());
            }

        });
    }
}