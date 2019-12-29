package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class adres extends AppCompatActivity implements View.OnClickListener {
    private CardView prev,tutorial,game,tests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        prev= (CardView) findViewById(R.id.previousyear);
        tutorial=(CardView) findViewById(R.id.tutor);
        game=(CardView) findViewById(R.id.cgame);
        tests=(CardView) findViewById(R.id.entrance);
        prev.setOnClickListener(this);
        tutorial.setOnClickListener(this);
        game.setOnClickListener(this);
        tests.setOnClickListener(this);

        /*getActionBar().setTitle("Student Resources");*/
    }

    @Override
    public void onClick(View v) {
        Intent i;
        String s;
        switch (v.getId()) {
            case R.id.previousyear : i= new Intent(this,WebActivity.class);
                s = "http://35.244.45.103:2626/qp/";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.tutor: i=new Intent(this,youtube.class);startActivity(i); break;
            case R.id.cgame : i= new Intent(this,WebActivity.class);
                  s = "https://www.hackerrank.com/interview/interview-preparation-kit";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.entrance : i= new Intent(this,WebActivity.class);
                s = "https://drive.google.com/drive/folders/0B7sWQEWGG8KVcG9sWTdoeHBFTEk";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            default:break;
        }
    }
}