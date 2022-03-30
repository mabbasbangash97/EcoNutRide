package com.sibau.econutride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class topspots extends AppCompatActivity {
    TextView title,dist;
    ImageView img;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topspots);
        getSupportActionBar().hide();
        title = (TextView) findViewById(R.id.topspot_title);
        dist = (TextView) findViewById(R.id.dist);
        img = (ImageView) findViewById(R.id.topspot_image);
        i = 1;
    }
    public void nextspot(View view){
        if(i == 1){
            title.setText("Babu Sar Top");
            dist.setText("Distance from Islamabad (km):" + "348.3");
            img.setImageResource(R.drawable.p1);
            i++;
        }
        else if(i == 2){
            title.setText("Bahrain (Swat)");
            dist.setText("Distance from Islamabad (km):" + "290.7");
            img.setImageResource(R.drawable.p2);
            i++;
        }
        else if(i == 3){
            title.setText("Fairy Meadows");
            dist.setText("Distance from Islamabad (km):" + "454.4");
            img.setImageResource(R.drawable.p3);
            i++;
        }
        else if(i == 4){
            title.setText("Nathia Gali");
            dist.setText("Distance from Islamabad (km):" + "84.7");
            img.setImageResource(R.drawable.p4);
            i++;
        }
        else if(i == 4){
            title.setText("Mukesh Puri");
            dist.setText("Distance from Islamabad (km):" + "81.7");
            img.setImageResource(R.drawable.p5);
            i++;
        }
        else if(i == 5){
            title.setText("Harnoi Waterfall");
            dist.setText("Distance from Islamabad (km):" + "144.6");
            img.setImageResource(R.drawable.p6);
            i=1;
        }


    }
}