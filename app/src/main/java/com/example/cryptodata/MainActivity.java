package com.example.cryptodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Vector;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        DataAdapter dataAdapter;
        ArrayList<dataModel> arrayList;
        Vector<dataModel> vector;
        RecyclerView recyclerView;
        InterfaceData anInterfaceData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcy);

        anInterfaceData =RetrofitInstance.getRetrofit().create(InterfaceData.class);
        Call<dataModel> call=anInterfaceData.getDataModel();
        call.enqueue(new Callback<dataModel>() {
            @Override
            public void onResponse(Call<dataModel> call, Response<dataModel> response) {
                if (response.isSuccessful()){
//                arrayList=new ArrayList<>();
                    vector=new Vector<>();
//                response.body().getCryptoCurrencyList().get(0).getTags();
                for (int i=0;i<=response.body().getData().getCryptoCurrencyList().size()-1;i++){
//                    arrayList.add(response.body());
                    vector.add(response.body());
                }
                dataAdapter=new DataAdapter(MainActivity.this,vector);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(dataAdapter);
                }
            }

            @Override
            public void onFailure(Call<dataModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();

            }
        });
    }
}