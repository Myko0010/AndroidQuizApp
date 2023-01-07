package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout Chapter1 = findViewById(R.id.javaLayout);
        final LinearLayout Chapter2 = findViewById(R.id.phpLayout);
        final LinearLayout Chapter3 = findViewById(R.id.htmlLayout);
        final LinearLayout Chapter4 = findViewById(R.id.androidLayout);

        final Button starBtn = findViewById(R.id.startQuizBtn);

        final String student_uid = getIntent().getStringExtra("Student uid");

        Chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "Chapter1";

                Chapter1.setBackgroundResource(R.drawable.round_back_whitestroke10);

                Chapter2.setBackgroundResource(R.drawable.round_back_white10);
                Chapter3.setBackgroundResource(R.drawable.round_back_white10);
                Chapter4.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        Chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Chapter2";

                Chapter2.setBackgroundResource(R.drawable.round_back_whitestroke10);

                Chapter1.setBackgroundResource(R.drawable.round_back_white10);
                Chapter3.setBackgroundResource(R.drawable.round_back_white10);
                Chapter4.setBackgroundResource(R.drawable.round_back_white10);
            }

        });

        Chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Chapter3";

                Chapter3.setBackgroundResource(R.drawable.round_back_whitestroke10);

                Chapter2.setBackgroundResource(R.drawable.round_back_white10);
                Chapter1.setBackgroundResource(R.drawable.round_back_white10);
                Chapter4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "Chapter4";
                Chapter4.setBackgroundResource(R.drawable.round_back_whitestroke10);

                Chapter2.setBackgroundResource(R.drawable.round_back_white10);
                Chapter1.setBackgroundResource(R.drawable.round_back_white10);
                Chapter3.setBackgroundResource(R.drawable.round_back_white10);
            }

        });
        starBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"please select the topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("Selected topic",selectedTopicName);
                    intent.putExtra("Student uid",student_uid);
                    startActivity(intent);
                }
            }
        });
    }
}