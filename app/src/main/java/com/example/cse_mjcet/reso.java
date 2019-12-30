package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
public class reso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reso);
        /*getActionBar().setTitle("Student Resources");*/

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AFREEN SULTANA");
        arrayList.add("AHMED");
        arrayList.add("DR A.A MOIZ QYSER");
        arrayList.add("FAHMINA TARNUM");
        arrayList.add("J. SRINIVAS");
        arrayList.add("K. MANMOHAN RAO");
        arrayList.add("K.S. NIRAJA");
        arrayList.add("K. SRIDEVI");
        arrayList.add("KHAJA ZAHOORUDDIN AHMED");
        arrayList.add("KRISHNA KEERTHI CHANNAM");
        arrayList.add("MANIZA HIJAB");
        arrayList.add("MANJUSHA KALEKURI");
        arrayList.add("MD. SALEEM KHAN");
        arrayList.add("MD. ZAINUDDIN NAVEED");
        arrayList.add("MIR AHMED ALI");
        arrayList.add("MOHAMMED ABDUL RAHEEM");
        arrayList.add("MOHAMMED AHMED");
        arrayList.add("MOHAMMED MAHMOOD ALI");
        arrayList.add("MOHAMMED NAZEER");
        arrayList.add("MD. SHABAZ HUSSAIN");
        arrayList.add("MD.SHABAZ HUSSAIN");
        arrayList.add("MOHAMMED SHARFUDDIN");
        arrayList.add("MOHAMMED UMAR FAROOQ");
        arrayList.add("NAIMOONISA BEGUM");
        arrayList.add("RAJESHAM GAJULA");
        arrayList.add("SHOUKAT ALI");
        arrayList.add("SYED MD AKBAR HASMI");
        arrayList.add("SYED MOHIUDDIN");
        arrayList.add("SYED SHABBEER AHMAD");
        arrayList.add("SYED AMBAREEN RANA");
        arrayList.add("UMA N. DULHARE");


        ListView listView = findViewById(R.id.mylist);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String identity=arrayAdapter.getItem(position);
                Intent i;
                i =new Intent(reso.this,WebActivity.class);
                String s;
                switch (identity) {
                    case "AFREEN SULTANA":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afreensultana";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "FAHMINA TARNUM":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ftaranum";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "AHMED":
                        Toast.makeText(reso.this,"Nothing to display",Toast.LENGTH_SHORT).show();
                        break;
                    case "DR A.A MOIZ QYSER":
                        Toast.makeText(reso.this,"Nothing to display",Toast.LENGTH_SHORT).show();
                        break;
                    case "J. SRINIVAS":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jsrinivas";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "K. MANMOHAN RAO":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kmanmohan";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "K.S. NIRAJA":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ksniraja";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "K. SRIDEVI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sridevi";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "KHAJA ZAHOORUDDIN AHMED":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zahooruddin";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "KRISHNA KEERTHI CHANNAM":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=krishna.keerthi";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MANIZA HIJAB":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manizahijab";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MANJUSHA KALEKURI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manjusha";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MD. SALEEM KHAN":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=saleemkhan";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MD. ZAINUDDIN NAVEED":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zainuddin";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MIR AHMED ALI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mir.ahmedali";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED ABDUL RAHEEM":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=maraheem";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED AHMED":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mohammed.ahmed";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED MAHMOOD ALI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mahmood";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED NAZEER":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nazeer";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MD. SHABAZ HUSSAIN":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabaz";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MD.SHABAZ HUSSAIN":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabaz.hussain";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED SHARFUDDIN":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sharfuddin";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "MOHAMMED UMAR FAROOQ":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=umarfarooq";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "NAIMOONISA BEGUM":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=naimoonisa";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "RAJESHAM GAJULA":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rajesham.gajula";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "SHOUKAT ALI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shoukatali";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "SYED MD AKBAR HASMI":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=akbar.hashmi";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "SYED MOHIUDDIN":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syed";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "SYED SHABBEER AHMAD":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabbeer.ahmad";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "SYED AMBAREEN RANA":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ambareen.rana";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;
                    case "UMA N. DULHARE":
                        s = "http://mjcollege.ac.in/studentresourceslist.php?resourceusername=uma.dulhare";
                        i.putExtra("URL", s);
                        startActivity(i);
                        break;

                }

            }
        });
    }
}