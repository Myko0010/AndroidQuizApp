package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Registration extends AppCompatActivity {

    EditText etFirstName,etLastName,etUid;
    RadioGroup radioGroup;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    Button rgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etFirstName = findViewById(R.id.firstName);
        etLastName = findViewById(R.id.lastName);
        etUid = findViewById(R.id.uid);

        rgButton = findViewById(R.id.registerButton);

        rgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}