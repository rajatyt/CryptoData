package com.example.cryptodata;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class cryptoCurrencyList {
    int id;
    String name;
    String symbol;
    String slug;

    @SerializedName("quotes")
    List<quotes> quotes;
    @SerializedName("tags")
    List<String> tags;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<quotes> getQuotes(){
    return quotes;
}
public void setQuotes (List<quotes> quotes){
    this.quotes = quotes;
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


}
