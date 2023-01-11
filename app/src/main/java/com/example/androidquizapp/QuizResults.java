package com.example.androidquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResults extends AppCompatActivity {
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswers);
        database=new Database(this);

        int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        int getInCorrectAnswers = getIntent().getIntExtra("incorrect", 0);
        final String student_uid = getIntent().getStringExtra("Student uid");
        final String selected_topic = getIntent().getStringExtra("Selected topic");


        String getCorrectAnswers2=getCorrectAnswers+"";
        database.AddResult(student_uid,selected_topic,getCorrectAnswers2);
        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText(String.valueOf(getInCorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuizResults.this,MainActivity.class);
                i.putExtra("Selected topic",selected_topic);
                i.putExtra("Student uid",student_uid);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}