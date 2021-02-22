package com.example.listenup;

import com.example.listenup.model.Feed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {

    //String BASE_URL = "https://itunes.apple.com/";
    @GET("search")
    Call<List<Feed>> getData(@Query("term") String artistName);
    @GET("search")
    Call<Feed> getData();

}
