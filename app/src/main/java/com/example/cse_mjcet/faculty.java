package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class faculty extends AppCompatActivity {

    //a list to store all the products
    List<Teacher> productList;

    //the RecyclerView
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        //getting the RecyclerView from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productList
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Teacher(
                        1,
                        "Dr. Ahmed Abdul Moiz Qyser",
                        "Professor and Head",
                        "B.E.(CSE), M.Tech(Software Engg.), Ph.D(CSE)",
                        "Ph: 9885454513",
                        "Room no: 5507",
                        R.drawable.moizqyser));

        productList.add(
                new Teacher(
                        2,
                        "K. Manmohan Rao",
                        "Professor",
                        "B.Sc., M.S.(Computer Science)",
                        "Ph: 9885175582",
                        "Room no: 5507",
                        R.drawable.manmohanrao));


        productList.add(
                new Teacher(
                        3,
                        "Dr. Uma N. Dulhare",
                        "Professor",
                        "B.E., M.Tech, Ph.D(CSE)",
                        "Ph: 9603225511",
                        "Room no: 5507",
                        R.drawable.umadulhare));

        productList.add(
                new Teacher(
                        1,
                        "Dr. Syed Shabbeer Ahmed",
                        "Professor & Associate Head",
                        "B.Tech, M.Tech, Ph.D",
                        "Ph: 9515302571",
                        "Room no: 5507",
                        R.drawable.syedshabbeer));

        productList.add(
                new Teacher(
                        1,
                        "Maniza Hijab",
                        "Associate Professor",
                        "B.Sc.(Electronics), MCA, M.Tech(CSE)",
                        "Ph: 9493410815",
                        "Room no: 5507",
                        R.drawable.manizahijab));

        productList.add(
                new Teacher(
                        1,
                        "Afreen Sultana",
                        "Associate Professor",
                        "B.E.(CSE), M.Tech(CSE)",
                        "Ph: 9247344987",
                        "Room no: 5507",
                        R.drawable.afreensultana));

        productList.add(
                new Teacher(
                        1,
                        "Fahmina Taranum",
                        "Associate Professor",
                        "B.E.(CSE), M.Tech(CSE)",
                        "Ph: 9394754916",
                        "Room no: 5507",
                        R.drawable.fahminataranum));

        productList.add(
                new Teacher(
                        1,
                        "Syed Mohiuddin",
                        "Associate Professor",
                        "B.Tech(CSE), M.S.(CS)",
                        "Ph:",
                        "Room no: 5507",
                        R.drawable.syedmohiuddin));

        productList.add(
                new Teacher(
                        1,
                        "Dr. Mohammed Mahmood Ali",
                        "Associate Professor",
                        "A.M.I.E.(CSE), M.Tech(Soft. Engg.), Ph.D(CSE)",
                        "Ph: 9848638696",
                        "Room no: 5507",
                        R.drawable.mahmoodali));

        productList.add(
                new Teacher(
                        1,
                        "Dr. Mohammed Umar Farooq",
                        "Associate Professor & Program Coordinator",
                        "B.E.(CSE), M.Tech(CSE), Ph.D",
                        "Ph: 9246333936",
                        "Room no: 5507",
                        R.drawable.umarfarooq));

        productList.add(
                new Teacher(
                        1,
                        "Shoukat Ali",
                        "Assistant Professor (S/G)",
                        "B.Sc., MCA, M.Tech(CSE)",
                        "Ph: 9246153857",
                        "Room no: 5507",
                        R.drawable.shoukatali));

        productList.add(
                new Teacher(
                        1,
                        "Syed Md. Akbar Hashmi",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(CSE)",
                        "Ph: 9394835377",
                        "Room no: 5507",
                        R.drawable.akbarhashmi));

        productList.add(
                new Teacher(
                        1,
                        "J. Srinivas",
                        "Assistant Professor",
                        "B.Tech(CSIT), M.Tech(Software Engg.)",
                        "Ph: 9949160927",
                        "Room no: 5507",
                        R.drawable.srinivas));

        productList.add(
                new Teacher(
                        1,
                        "Md. Saleem Khan",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(Software Engg.)",
                        "Ph: 9391669248",
                        "Room no: 5507",
                        R.drawable.saleemkhan));

        productList.add(
                new Teacher(
                        1,
                        "Syeda Ambareen Rana",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(CSE)",
                        "Ph: 9908119190",
                        "Room no: 5507",
                        R.drawable.syedaambreen));

        productList.add(
                new Teacher(
                        1,
                        "Mohammed Nazeer",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(CS)",
                        "Ph: 9912186181",
                        "Room no: 5507",
                        R.drawable.mohdnazeer));

        productList.add(
                new Teacher(
                        1,
                        "Naimoonisa Begum",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(CS)",
                        "Ph: 9703350236",
                        "Room no: 5507",
                        R.drawable.naimoonisabegum));

        productList.add(
                new Teacher(
                        1,
                        "Ahmed",
                        "Assistant Professor",
                        "B.E., M.Tech",
                        "Ph: 9849524750",
                        "Room no: 5507",
                        R.drawable.ahmed));

        productList.add(
                new Teacher(
                        1,
                        "Manjusha Kalekuri",
                        "Assistant Professor",
                        "B.Tech(CSE), M.E.(CSE)",
                        "Ph: 888577133",
                        "Room no: 5507",
                        R.drawable.manjushakalekuri));

        productList.add(
                new Teacher(
                        1,
                        "Mohammed Sharfuddin",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(Software Engg.)",
                        "Ph: 9848689595",
                        "Room no: 5507",
                        R.drawable.sharfuddin));

        productList.add(
                new Teacher(
                        1,
                        "Md. Zainuddin Naveed",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(CSE)",
                        "Ph: 8019177889",
                        "Room no: 5507",
                        R.drawable.zainuddinnaveed));

        productList.add(
                new Teacher(
                        1,
                        "K. Sridevi",
                        "Assistant Professor",
                        "DOEACC B Level, M.Tech(CSE), AMIE",
                        "Ph: 9959063991",
                        "Room no: 5507",
                        R.drawable.sridevi));

        productList.add(
                new Teacher(
                        1,
                        "Mir Ahmed Ali",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(Software Engg.)",
                        "Ph: 9010149047",
                        "Room no: 5507",
                        R.drawable.ahmedali));

        productList.add(
                new Teacher(
                        1,
                        "K. S. Niraja",
                        "Assistant Professor",
                        "B.E.(CSE), M.Tech(CSE)",
                        "Ph: 9866195615",
                        "Room no: 5507",
                        R.drawable.niraja));

        productList.add(
                new Teacher(
                        1,
                        "Mohammed Ahmed",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(CSE)",
                        "Ph:",
                        "Room no: 5507",
                        R.drawable.mohammedahmed));

        productList.add(
                new Teacher(
                        1,
                        "Krishna Keerthi Channam",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(ES)",
                        "Ph: 9502241066",
                        "Room no: 5507",
                        R.drawable.krishnakeerthi));

        productList.add(
                new Teacher(
                        1,
                        "Khaja Zahooruddin Ahmed",
                        "Assistant Professor",
                        "B.Tech(CSE), M.Tech(CSE)",
                        "Ph: 9652350351",
                        "Room no: 5507",
                        R.drawable.khajazahooruddin));

        productList.add(
                new Teacher(
                        1,
                        "Mohammed Shabaz Hussain",
                        "Assistant Professor",
                        "B.Sc., MCA, M.Tech(CS)",
                        "Ph: 9985012875",
                        "Room no: 5507",
                        R.drawable.shabaz));

        productList.add(
                new Teacher(
                        1,
                        "Mohammed Abdul Raheem",
                        "Assistant Professor",
                        "B.Sc., MCA, M.Tech(CSE)",
                        "Ph: 9948170286",
                        "Room no: 5507",
                        R.drawable.abdulraheem));

        productList.add(
                new Teacher(
                        1,
                        "Rajesham Gajula",
                        "Assistant Professor",
                        "B.Tech(CSIT), M.Tech(SE)",
                        "Ph: 9492782101",
                        "Room no: 5507",
                        R.drawable.rajeshamgajula));


        //creating RecyclerView adapter
        TeacherAdapter adapter = new TeacherAdapter(this, productList);

        //setting adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
