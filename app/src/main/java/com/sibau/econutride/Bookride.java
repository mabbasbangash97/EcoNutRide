package com.sibau.econutride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Bookride extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookride);
        getSupportActionBar().hide();
    }
}