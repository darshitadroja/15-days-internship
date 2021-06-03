package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView tvname,tvmail,tvpswd,tvnumber,tvhb,tvg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvname=findViewById(R.id.tvname);
        tvmail=findViewById(R.id.tvmail);
        tvpswd=findViewById(R.id.tvpswd);
        tvnumber=findViewById(R.id.tvnumber);
        tvhb=findViewById(R.id.tvhb);
        tvg=findViewById(R.id.tvg);


        Intent intent=getIntent();
        String n1=intent.getStringExtra("NAME") ;
        String gender=intent.getStringExtra("radiobutton") ;
        tvg.setText("your gender is " +gender);
        tvname.setText("welcome " +n1);
        String email=intent.getStringExtra("mail") ;
        tvmail.setText("your mail id is " +email);
        String phone=intent.getStringExtra("number") ;
        tvnumber.setText("your phone no is " +phone);
        String password=intent.getStringExtra("pswd") ;
        tvpswd.setText("your password is  " +password);
        String hobbies=intent.getStringExtra("hb") ;
        tvhb.setText("your hobbies are " +hobbies);


    }
}