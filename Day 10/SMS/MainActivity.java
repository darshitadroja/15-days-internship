package com.example.smsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        msg=findViewById(R.id.msg);

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=et1.getText().toString();
                String msg=et2.getText().toString();

                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(number,null,msg,null,null);
                Toast.makeText(getApplicationContext(),"MESSAGE SENT SUCCESSFULLY...",
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}