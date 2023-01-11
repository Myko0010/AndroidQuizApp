package com.example.androidquizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     String selectedTopicName = "";
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);
        database=new Database(this);

        final LinearLayout Chapter1 = findViewById(R.id.javaLayout);
        final LinearLayout Chapter2 = findViewById(R.id.phpLayout);
        final LinearLayout Chapter3 = findViewById(R.id.htmlLayout);
        final LinearLayout Chapter4 = findViewById(R.id.androidLayout);


        final Button starBtn = findViewById(R.id.startQuizBtn);

         String student_uid = getIntent().getStringExtra("Student uid");
        selectedTopicName=getIntent().getStringExtra("Selected topic");

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

                    Integer result=database.checkQuizStatus(selectedTopicName,student_uid);
                    if(result>0){
                        Toast.makeText(MainActivity.this,"You have already taken this quiz!", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                        intent.putExtra("Selected topic",selectedTopicName);
                        intent.putExtra("Student uid",student_uid);
                        startActivity(intent);
                    }
                }
            }
        });




    }
@Override
    public void onBackPressed() {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("If You Exit now you can't go back again")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.super.onBackPressed();
                        Intent i = new Intent(MainActivity.this,LoginPage.class);

                        startActivity(i);
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}