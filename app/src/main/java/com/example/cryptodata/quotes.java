package com.example.cryptodata;

public class quotes {
    String name;
    float price;
    float volume24h;
    float percentChange1h;

    public float getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(float percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Float getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(float volume24h) {
        this.volume24h = volume24h;
    }
}
