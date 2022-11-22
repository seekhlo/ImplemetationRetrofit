package com.example.implemetationretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Set {
@GET("photos")
Call<List<ObjectModel>> getData();
}
