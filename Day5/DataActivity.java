package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvname=findViewById(R.id.tvname);

        Intent intent=getIntent();
        String n1=intent.getStringExtra("NAME") ;
        tvname.setText("welcome " +n1);
    }
}