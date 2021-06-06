package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    int image[]={R.drawable.java,R.drawable.python,R.drawable.php,R.drawable.c,R.drawable.kotlin,R.drawable.dart,R.drawable.aspnet};
    String []name={"Java ","Python","Php","c/c++ language","Kotlin","dart","Asp.net"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(MainActivity.this,image,name);
        lv1.setAdapter(myAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,listdata.class);
                intent.putExtra("i1",image[position]);
                intent.putExtra("t1",name[position]);
                startActivity(intent);
            }
        });

    }
}