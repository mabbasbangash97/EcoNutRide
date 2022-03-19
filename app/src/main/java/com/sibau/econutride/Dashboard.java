package com.sibau.econutride;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    CardView bookride,topspots,ridehistory,gallery,mycoupons,featureddrivers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();
        bookride = (CardView) findViewById(R.id.bookride);
        topspots = (CardView) findViewById(R.id.topspots);
        ridehistory = (CardView) findViewById(R.id.ridehistory);
        gallery = (CardView) findViewById(R.id.gallery);
        mycoupons = (CardView) findViewById(R.id.mycoupons);
        featureddrivers = (CardView) findViewById(R.id.featuredrivers);
        bookride.setOnClickListener(this);
        topspots.setOnClickListener(this);
        ridehistory.setOnClickListener(this);
        gallery.setOnClickListener(this);
        mycoupons.setOnClickListener(this);
        featureddrivers.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.bookride:
                intent = new Intent(this,Bookride.class);
                startActivity(intent);
                break;

            case R.id.topspots:
                intent = new Intent(this,topspots.class);
                startActivity(intent);
                break;

            case R.id.ridehistory:
                intent = new Intent(this,ridehistory.class);
                startActivity(intent);
                break;

            case R.id.gallery:
                intent = new Intent(this,gallery.class);
                startActivity(intent);
                break;

            case R.id.mycoupons:
                intent = new Intent(this,mycoupons.class);
                startActivity(intent);
                break;

            case R.id.featuredrivers:
                intent = new Intent(this,featureddrivers.class);
                startActivity(intent);
                break;

            default:
                break;

        }

    }
}