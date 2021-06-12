package com.example.musicplayapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button6;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button6 = (Button) findViewById(R.id.button6);


        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.audio);

        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button6:
                if(!mediaPlayer.isPlaying())
                {
                    mediaPlayer.start();
                }
                else if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                }
                break;
        }
    }
}