package com.mid1.econutride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class mainsreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mainsreen);
    }
}