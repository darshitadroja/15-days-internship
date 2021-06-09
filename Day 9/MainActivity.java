package com.example.registrarionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etname,etmail,etpswd,etnumber;
    Button btn;

    public static final String main_key="my_pref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname=findViewById(R.id.etname);
        etmail=findViewById(R.id.etmail);
        etpswd=findViewById(R.id.etpswd);
        etnumber=findViewById(R.id.etnumber);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String username=etname.getText().toString();
                String userpassword=etpswd.getText().toString();
                String useremail=etmail.getText().toString();
                String usermobile=etnumber.getText().toString();

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString(name_key,username);
                editor.putString(email_key,useremail);
                editor.putString(password_key,userpassword);
                editor.putString(contact_key,usermobile);
                editor.commit();

                Intent intent=new Intent(MainActivity.this,loginactivity.class);
                intent.putExtra("etname",  username);
                intent.putExtra("etmail",userpassword);
                intent.putExtra("etpswd",useremail);
                intent.putExtra("etnumber",usermobile);
                startActivity(intent);

            }
        });


    }
}