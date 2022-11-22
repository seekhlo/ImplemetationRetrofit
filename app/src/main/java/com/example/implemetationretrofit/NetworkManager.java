package com.example.implemetationretrofit;
import androidx.annotation.RestrictTo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {

    public static  NetworkManager clientObject;
    private static Retrofit retrofit;

    NetworkManager(){
        retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
    }
   public static synchronized NetworkManager getInstance() {
        if(clientObject == null){
            clientObject = new NetworkManager();
        }
       return clientObject;
   }
   API_Set getAPI(){
        return retrofit.create(API_Set.class);
   }
}
