package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AdminDashBord extends AppCompatActivity {
    Database database;
    CardView cardHome,cardChat,cardProfile,cardWidget,cardSetting,cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dash_bord);
        cardHome=findViewById(R.id.cardHome);
        cardChat=findViewById(R.id.cardChat);
        cardProfile=findViewById(R.id.cardProfile);
        cardWidget=findViewById(R.id.cardWidget);
        cardSetting=findViewById(R.id.cardSee);
        cardLogout=findViewById(R.id.cardLogout);
        database=new Database(this);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminDashBord.this,AddQuestion.class);
                startActivity(i);

                showToast("Home clicked");
            }
        });
        cardChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showToast("Chat clicked");
            }
        });

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(AdminDashBord.this,Registration.class);
                startActivity(i);
            }
        });

        cardWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Widget clicked");
            }
        });

        cardSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data=database.getResult();
                if(data.equals("")){
                    Toast.makeText(AdminDashBord.this, "There is no result", Toast.LENGTH_SHORT).show();
                }else{
                  Intent intent =new Intent(AdminDashBord.this,seeResult.class);
                  startActivity(intent);
                }
            }
        });
        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminDashBord.this,LoginPage.class);
                startActivity(i);
                showToast("logout clicked");
            }
        });
    }
    private  void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}