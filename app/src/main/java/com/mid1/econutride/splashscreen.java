package com.mid1.econutride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Handler start = new Handler();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        start.postAtTime(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,
                        login.class);
                startActivity(intent);
            }
        },10000);
    }
}