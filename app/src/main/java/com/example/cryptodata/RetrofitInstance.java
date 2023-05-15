package com.example.cryptodata;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String BaseUrl="https://api.coinmarketcap.com/";

    public static Retrofit getRetrofit(){
if(retrofit==null){
            retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BaseUrl)
                .build();
}

        return retrofit;
    }
}
