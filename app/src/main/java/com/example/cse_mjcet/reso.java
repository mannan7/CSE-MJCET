package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reso extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reso);
        /*getActionBar().setTitle("Student Resources");*/
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        Intent i;
        i =new Intent(this,WebActivity.class);
        String s;
        switch (id)
        {
            case R.id.AFREEN : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afreensultana";
            i.putExtra("URL",s);
            startActivity(i);break;
            case R.id.AHMED:
                Toast.makeText(this,"NOTHING TO DISPLAY",Toast.LENGTH_LONG).show();break;
            case R.id.hod:
                Toast.makeText(this,"NOTHING TO DISPLAY",Toast.LENGTH_LONG).show();break;
            case R.id.FAHMINA : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ftaranum";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SRINIVAS : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jsrinivas";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.MANMOHAN : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kmanmohan";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.NIRAJA : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ksniraja";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SRIDEVI : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sridevi";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.zahoOR : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zahooruddin";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.keerTHI : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=krishna.keerthi";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.manIZA : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manizahijab";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.manjusha : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manjusha";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SALEEM : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=saleemkhan";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.ZAIN : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zainuddin";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.ahmedALI : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mir.ahmedali";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.RAHEEM : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=maraheem";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.mAHMED : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mohammed.ahmed";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.MAHMOOD : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mahmood";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.NAZEER : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nazeer";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SHAHBAZ : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabaz";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SHAHBAZ2 : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabaz.hussain";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.sharfu : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sharfuddin";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.UMAR : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=umarfarooq";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.NAIM : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=naimoonisa";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.RAJESHAM : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rajesham.gajula";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SHOUKAT : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shoukatali";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.AKBAR : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=akbar.hashmi";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.MOHIUDDIN : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syed";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.SHABBEER : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabbeer.ahmad";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.RANA : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ambareen.rana";
                i.putExtra("URL",s);
                startActivity(i);break;
            case R.id.UMA : s="http://mjcollege.ac.in/studentresourceslist.php?resourceusername=uma.dulhare";
                i.putExtra("URL",s);
                startActivity(i);break;

        }

    }
}
