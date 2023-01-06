package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class seeResult extends AppCompatActivity {
    Database database;
    TextView textView;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_result);

        textView=findViewById(R.id.viewResult);
        database=new Database(this);

        data=database.getResult();
        textView.setText(data);


    }
}