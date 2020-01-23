package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static int SPLASH_TIME_OUT=4000;
    private CardView notice,faculty,res,ares,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notice= (CardView) findViewById(R.id.noticeId);
        faculty= (CardView) findViewById(R.id.facultyId);
        res= (CardView) findViewById(R.id.resourcesId);
        ares= (CardView) findViewById(R.id.adresId);
        about= (CardView) findViewById(R.id.aboutId);
        notice.setOnClickListener(this);
        faculty.setOnClickListener(this);
        res.setOnClickListener(this);
        ares.setOnClickListener(this);
        about.setOnClickListener(this);
        getSupportActionBar().hide();

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.noticeId : i= new Intent(this,WebActivity.class);
            String s="https://cse-mjcet.wixsite.com/mj-cse";
            i.putExtra("URL",s);
            startActivity(i); break;
            case R.id.facultyId : i=new Intent(this,faculty.class);startActivity(i); break;
            case R.id.resourcesId :i =new Intent(this,reso.class);startActivity(i); break;
            case R.id.adresId: i=new Intent(this,adres.class);startActivity(i); break;
            case R.id.aboutId:i=new Intent(this, com.example.cse_mjcet.about.class);startActivity(i); break;
            default: break;
        }


    }



}
