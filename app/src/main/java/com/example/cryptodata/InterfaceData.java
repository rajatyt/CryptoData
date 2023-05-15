package com.example.cryptodata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceData {

    @GET("data-api/v3/cryptocurrency/listing?limit=30")
     Call<dataModel> getDataModel();
}
