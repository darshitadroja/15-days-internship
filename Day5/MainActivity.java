package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    EditText name,mail,number,pswd,hb;
    RadioGroup rdgrp;
    RadioButton radioButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        mail=findViewById(R.id.mail);
        number=findViewById(R.id.number);
        pswd=findViewById(R.id.pswd);
        hb=findViewById(R.id.hb);
        submit=findViewById(R.id.submit);
        rdgrp= (RadioGroup) findViewById(R.id.rdgrp);


        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId=rdgrp.getCheckedRadioButtonId();
                radioButton=(RadioButton)findViewById(selectedId);

                String gender=radioButton.getText().toString();
                String n1=name.getText().toString();
                String email=mail.getText().toString();
                String phone=number.getText().toString();
                String password=pswd.getText().toString();
                String hobbies=hb.getText().toString();



                Intent intent=new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("NAME",  n1);
                intent.putExtra("mail",email);
                intent.putExtra("pswd",password);
                intent.putExtra("number",phone);
                intent.putExtra("hb",hobbies);
                intent.putExtra("radiobutton",gender);

                startActivity(intent);


            }
        });

    }
}