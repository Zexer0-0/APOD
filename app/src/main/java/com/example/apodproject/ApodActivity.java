package com.example.apodproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ApodActivity extends AppCompatActivity {
     private RecyclerView apod_recyclerview;
     private String start_date = "";
     private String end_date = "";
     private TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apod);
        Intent intent = getIntent();
        start_date = intent.getStringExtra("start_date");
        end_date = intent.getStringExtra("end_date");
        apod_recyclerview = findViewById(R.id.apod_recyclerview);

    }
}