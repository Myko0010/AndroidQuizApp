package com.example.androidquizapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
public class Registration extends AppCompatActivity {

    EditText First_Name,Last_Name,U_id;
    RadioGroup Rggender;
    RadioButton selected_gender;
    Button btn_register;
    Spinner stud_department;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        First_Name = findViewById(R.id.firstName);
        Last_Name = findViewById(R.id.lastName);
        U_id = findViewById(R.id.uid);
        stud_department=findViewById(R.id.department);

        btn_register = findViewById(R.id.registerButton);
        Rggender=findViewById(R.id.rgGender);
        database=new Database(Registration.this);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname,lname,student_uid,department1,gender2;
                fname=First_Name.getText().toString();
                lname=Last_Name.getText().toString();
                student_uid=U_id.getText().toString();
                Integer integer_uid=Integer.parseInt(student_uid);
                department1=stud_department.getSelectedItem().toString();
                int id4=Rggender.getCheckedRadioButtonId();
                selected_gender = findViewById(id4);
                gender2=selected_gender.getText().toString();
                if(fname.isEmpty() || lname.isEmpty() || student_uid.isEmpty() || gender2.isEmpty()){
                    Toast.makeText(Registration.this, "FIELDS ARE REQUIRED", Toast.LENGTH_SHORT).show();
                }
                else{
                    int result=database.checkStudentForRegistration(integer_uid);
                    if(result>0){
                        Toast.makeText(Registration.this,"Student Exists"
                                ,Toast.LENGTH_LONG).show();
                    }
                    else{
                        boolean sucessful= database.addStudent(fname,lname,integer_uid,gender2,department1);
                        if(sucessful == false){
                            Toast.makeText(Registration.this,"wrong"
                                    ,Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(Registration.this,"sucess"
                                    ,Toast.LENGTH_LONG).show();
                            Intent i = new Intent(Registration.this,AdminDashBord.class);
                            startActivity(i);
                        }
                    }
                }
            }
        });
    }
}