package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteStudent extends AppCompatActivity {

  EditText stud_Uid,stud_firstName,stud_department;
  Button search_Button,delete_Button;

  Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_student);

        database = new Database(this);

        stud_Uid = findViewById(R.id.uid);
        stud_firstName = findViewById(R.id.firstName);
        stud_department = findViewById(R.id.etDepartment);
        search_Button = findViewById(R.id.searchButton);
        delete_Button = findViewById(R.id.btnDelete);

        search_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = database.searchStudent(stud_Uid.getText().toString());
                if(cursor.getCount() == 0){
                    Toast.makeText(DeleteStudent.this, "There is no data found!", Toast.LENGTH_SHORT).show();
                }

                else{
                    String first_Name,department;
                    first_Name = cursor.getString(1);
                    department = cursor.getString(5);
                    stud_firstName.setText(first_Name);
                    stud_department.setText(department);
                }
            }
        });

        delete_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Integer deleteStud = database.deleteStudent(stud_Uid.getText().toString());

            if(deleteStud > 0){
                Toast.makeText(DeleteStudent.this, "Data is deleted!", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(DeleteStudent.this, "Something is wrong", Toast.LENGTH_SHORT).show();
            }
            }
        });


    }
}