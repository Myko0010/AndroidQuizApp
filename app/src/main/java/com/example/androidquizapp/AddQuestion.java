package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddQuestion extends AppCompatActivity {
    EditText Question,choiceA,choiceB,choiceC,choiceD,Answer;
    Spinner Chapter;
    Button addQuestion;
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
        Question=findViewById(R.id.question);
        choiceA=findViewById(R.id.firstchoice);
        choiceB=findViewById(R.id.secondchoice);
        choiceC=findViewById(R.id.thirdchoice);
        choiceD=findViewById(R.id.fourthchoice);
        Answer=findViewById(R.id.answer);
        Chapter=findViewById(R.id.chapter);
        addQuestion=findViewById(R.id.addButton);
        database = new Database(this);

        addQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question1,choiceA1,choiceB1,choiceC1,choiceD1,Answer1,Chapter1;
                question1=Question.getText().toString();
                choiceA1=choiceA.getText().toString();
                choiceB1=choiceB.getText().toString();
                choiceC1=choiceC.getText().toString();
                choiceD1=choiceD.getText().toString();
                Answer1=Answer.getText().toString();
                Chapter1=Chapter.getSelectedItem().toString();
                if(question1.isEmpty() || choiceA1.isEmpty() || choiceB1.isEmpty() || choiceC1.isEmpty()
                        || choiceD1.isEmpty() || Answer1.isEmpty() ||  Chapter1.isEmpty() ) {
                    Toast.makeText(AddQuestion.this, "fields are required", Toast.LENGTH_SHORT).show();
                }
                else{
                    int result=database.checkQuestion(question1);
                    if(result>0){
                        Toast.makeText(AddQuestion.this,"Student Exists"
                                ,Toast.LENGTH_LONG).show();
                    }
                    else{
                        boolean sucessful= database.addQuestion(Chapter1,question1,choiceA1,choiceB1,choiceC1,choiceD1,Answer1);
                        if(sucessful == false){
                            Toast.makeText(AddQuestion.this,"wrong"
                                    ,Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(AddQuestion.this,"success"
                                    ,Toast.LENGTH_LONG).show();
                            Intent i = new Intent(AddQuestion.this,AdminDashBord.class);
                            startActivity(i);
                        }
                    }
                }
            }
        });
    }
}