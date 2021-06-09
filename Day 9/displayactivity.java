package com.example.registrarionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class displayactivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    Button btnlogout;

    public static final String main_key="my_pref";
    public static final String email_key="emailkey";
    public static final String name_key="namekey";
    public static final String contact_key="contactkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayactivity);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        btnlogout=findViewById(R.id.btnlogout);

        SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
        String email=preferences.getString(email_key,"");
        String name=preferences.getString(name_key,"");
        String number=preferences.getString(contact_key,"");
        tv1.setText("welcome :- " +name);
        tv2.setText("mail id is:- " +email);
        tv3.setText("number is:- " +number);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                finish();
            }
        });

        



    }
}