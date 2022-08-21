package com.example.reccardview;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myapi {

    @GET("users")
    Call<ArrayList<Model>> getModels();

}
