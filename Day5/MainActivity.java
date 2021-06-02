package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText name,mail,number,pswd;
    Button rb1,rb2,cb1,cb2,cb3,cb4,submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=findViewById(R.id.name);
        mail=findViewById(R.id.mail);
        number=findViewById(R.id.number);
        pswd=findViewById(R.id.pswd);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n1=name.getText().toString();
                Intent intent=new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("NAME",  n1);
                startActivity(intent);

            }
        }

        );

    }
}