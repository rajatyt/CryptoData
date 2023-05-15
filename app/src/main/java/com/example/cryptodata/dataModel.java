package com.example.cryptodata;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class dataModel {
    @SerializedName("data")
    private dataModel data;

    @SerializedName("cryptoCurrencyList")
    List<cryptoCurrencyList> cryptoCurrencyList;


    public dataModel getData() {
        return data;
    }

    public void setData(dataModel data) {
        this.data = data;
    }

    public List<cryptoCurrencyList> getCryptoCurrencyList() {
        return cryptoCurrencyList;
    }

    public void setCryptoCurrencyList(List<cryptoCurrencyList> cryptoCurrencyList) {
        this.cryptoCurrencyList = cryptoCurrencyList;
    }

}
