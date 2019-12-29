package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class youtube extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        /*getActionBar().setTitle("Student Resources");*/
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        Intent i;
        i = new Intent(this, WebActivity.class);
        String s;
        switch (id) {
            case R.id.Clang:
                s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.Cplus:
                s = "https://www.youtube.com/playlist?list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.DS:
                s = "https://www.youtube.com/playlist?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.JAVA:
                s = "https://www.youtube.com/playlist?list=PLWPirh4EWFpFfTUVBl5KbeXly1sHKSc-Z";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.LST:
                s="https://www.youtube.com/playlist?list=PLBlnK6fEyqRjMH3mWf6kwqiTbT798eAOm";
                i.putExtra("URL",s);
                startActivity(i);
            case R.id.DM:
                s="https://www.youtube.com/playlist?list=PLBlnK6fEyqRhqJPDXcvYlLfXPh37L89g3";
                i.putExtra("URL",s);
                startActivity(i);
            case R.id.ALC:
                s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRgp46KUv4ZY69yXmpwKOIev";
                i.putExtra("URL", s);
                startActivity(i);
                break;
            case R.id.OS:
                s="https://www.youtube.com/playlist?list=PLBlnK6fEyqRiVhbXDGLXDk_OQAeuVcp2O";
                i.putExtra("URL",s);
                startActivity(i);
            case R.id.CN:
                s="https://www.youtube.com/playlist?list=PLBlnK6fEyqRgMCUAG0XRw78UA8qnv6jEx";
                i.putExtra("URL",s);
                startActivity(i);

        }
    }
}
