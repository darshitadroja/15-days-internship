package com.example.registrarionactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    EditText etmail2,etpswd2;
    Button btnlogin,btnsignup;

    public static final String main_key="my_pref";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        etmail2=findViewById(R.id.etmail2);
        etpswd2=findViewById(R.id.etpswd2);
        btnlogin=findViewById(R.id.btnlogin);
        btnsignup=findViewById(R.id.btnsignup);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usermail2=etmail2.getText().toString();
                String userpassword2=etpswd2.getText().toString();

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);

                String usermail1=preferences.getString(email_key,"");
                String userpassword1=preferences.getString(password_key,"");
                if (usermail2.equals(usermail1) && userpassword2.equals(userpassword1))  {

                    Intent intent=new Intent(loginactivity.this,displayactivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(loginactivity.this,"Invalid Login Details",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loginactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}