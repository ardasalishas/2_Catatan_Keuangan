package com.example.a2_catatan_keuangan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class newtransaksi extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtransaksi);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.list_record);
        s2 = getResources().getStringArray(R.array.description);

        newtransaksiAdapter myAdapter = new newtransaksiAdapter(this, s1,s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}