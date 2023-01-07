package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        database=new Database(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name,pass_word;
                user_name=username.getText().toString();
                pass_word=password.getText().toString();
                Integer int_password=Integer.parseInt(pass_word);
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                   Toast.makeText(LoginPage.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginPage.this,AdminDashBord.class);
                    startActivity(i);
              } else {

                    int result=database.checkStudent(int_password,user_name);
                    if(result>0){
                        Intent i = new Intent(LoginPage.this,MainActivity.class);
                        i.putExtra("Student uid",pass_word);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(LoginPage.this, "incorrect user name or password", Toast.LENGTH_SHORT).show();
                    }
               }
            }
        });




    }
}