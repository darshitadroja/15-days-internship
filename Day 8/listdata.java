package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class listdata extends AppCompatActivity {
    ImageView iv2;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);
        iv2= findViewById(R.id.iv2);
        tv2=findViewById(R.id.tv2);


        Intent intent=getIntent();

        String name=intent.getStringExtra("t1");
        tv2.setText("welcome to "+name);

        int image= intent.getIntExtra("i1",R.drawable.java);
        iv2.setImageResource(image);

    }
}