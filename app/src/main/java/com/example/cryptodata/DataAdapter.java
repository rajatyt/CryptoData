package com.example.cryptodata;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Vector;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    Context context;
    Vector<dataModel> dataValue;

    public DataAdapter(Context context, Vector<dataModel> dataValue) {
        this.context = context;
        this.dataValue = dataValue;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.data_adapter,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        dataModel data=dataValue.get(position);
        holder.name.setText(data.getData().getCryptoCurrencyList().get(position).getName());
        holder.symbol.setText(data.getData().getCryptoCurrencyList().get(position).getSymbol());
        holder.price.setText(String.format("%.3f",data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPrice()));

if (data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPercentChange1h()>0){
    holder.cardView.setCardBackgroundColor(Color.parseColor("#00D100"));

    holder.plusminus.setText("+"+data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPercentChange1h());
//    holder.plusminus.setText((int) data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPercentChange1h());
}else {
    holder.cardView.setCardBackgroundColor(Color.parseColor("#FF0000"));
//    holder.plusminus.setText((int) data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPercentChange1h());
    holder.plusminus.setText(" "+data.getData().getCryptoCurrencyList().get(position).getQuotes().get(0).getPercentChange1h());

}
        Glide.with(context).load("https://s2.coinmarketcap.com/static/img/coins/64x64/" + data.getData().getCryptoCurrencyList().get(position).getId() + ".png").into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return dataValue.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,symbol,price,plusminus;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            symbol=itemView.findViewById(R.id.symbol);
            price=itemView.findViewById(R.id.price);
            plusminus=itemView.findViewById(R.id.plusorminus);
            imageView=itemView.findViewById(R.id.img);
            cardView=itemView.findViewById(R.id.card_view);
        }
    }
}
