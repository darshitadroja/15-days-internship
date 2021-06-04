package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splashload extends AppCompatActivity {
    MediaPlayer music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);


        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashload);
        Thread thread = new Thread() {
            public void run() {
                try {
                    music = MediaPlayer.create(Splashload.this, R.raw.tone);
                    music.start();
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splashload.this, MainActivity.class);
                    startActivity(intent);
                }

            }


        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        music.release();
        finish();
    }
}