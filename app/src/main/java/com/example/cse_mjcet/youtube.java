package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C PROGRAMMING");
        arrayList.add("C++ PROGRAMMING");
        arrayList.add("DATA STRUCTURES");
        arrayList.add("JAVA");
        arrayList.add("LOGIC AND SWITCHING THEORY");
        arrayList.add("DISCRETE MATHEMATICS");
        arrayList.add("AUTOMATA LANGUAGES AND COMPUTATION");
        arrayList.add("OPERATING SYSTEMS");
        arrayList.add("COMPUTER NETWORKS");
        arrayList.add("PYTHON");
        arrayList.add("WEB PROGRAMMING");
        arrayList.add("ML TUTORIALS");
        ListView listView = findViewById(R.id.mylist);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                String identity = arrayAdapter.getItem(position);
                                                Intent i;
                                                i = new Intent(youtube.this, WebActivity.class);
                                                String s;
                                                switch (identity) {
                                                    case "C PROGRAMMING":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "C++ PROGRAMMING":
                                                        s = "https://www.youtube.com/playlist?list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "DATA STRUCTURES":
                                                        s = "https://www.youtube.com/playlist?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "JAVA":
                                                        s = "https://www.youtube.com/playlist?list=PLWPirh4EWFpFfTUVBl5KbeXly1sHKSc-Z";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "LOGIC AND SWITCHING THEORY":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRjMH3mWf6kwqiTbT798eAOm";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "DISCRETE MATHEMATICS":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRhqJPDXcvYlLfXPh37L89g3";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "AUTOMATA LANGUAGES AND COMPUTATION":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRgp46KUv4ZY69yXmpwKOIev";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "OPERATING SYSTEMS":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRiVhbXDGLXDk_OQAeuVcp2O";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "COMPUTER NETWORKS":
                                                        s = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRgMCUAG0XRw78UA8qnv6jEx";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "PYTHON":
                                                        s = "https://www.youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "WEB PROGRAMMING":
                                                        s = "https://www.youtube.com/playlist?list=PLwoh6bBAszPrES-EOajos_E9gvRbL27wz";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;
                                                    case "ML TUTORIALS":
                                                        s = "https://www.youtube.com/playlist?list=PLQVvvaa0QuDfKTOs3Keq_kaG2P55YRn5v";
                                                        i.putExtra("URL", s);
                                                        startActivity(i);
                                                        break;

                                                }
                                            }


                                        }
        );
    }
}
