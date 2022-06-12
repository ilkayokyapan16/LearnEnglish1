package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage extends AppCompatActivity {
    Button btn_Renk;
    Button sayis;
    Button dogal;
    Button hayvans;
    Button memleket;
    Button techno;
    Button food;
    Button zanaat;
    Button geriset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        btn_Renk=findViewById(R.id.btn_renk);
        btn_Renk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent renk=new Intent(mainpage.this,colors.class);
                startActivity(renk);
            }
        });
        sayis=findViewById(R.id.btn_sayi);
        sayis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nature=new Intent(mainpage.this,numbers.class);
                startActivity(nature);
            }
        });
        hayvans=findViewById(R.id.btn_hayvan);
        hayvans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ulke=new Intent(mainpage.this,animals.class);
                startActivity(ulke);
            }
        });
        techno=findViewById(R.id.btn_tekno);
        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemek=new Intent(mainpage.this,tech.class);
                startActivity(yemek);
            }
        });
        zanaat=findViewById(R.id.btn_meslek);
        zanaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sett=new Intent(mainpage.this,jobs.class);
                startActivity(sett);
            }
        });
        dogal=findViewById(R.id.btn_doga);
        dogal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nature=new Intent(mainpage.this,nature.class);
                startActivity(nature);
            }
        });
        memleket=findViewById(R.id.btn_ulkee);
        memleket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ulke=new Intent(mainpage.this,country.class);
                startActivity(ulke);
            }
        });
        food=findViewById(R.id.btn_yemek);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemek=new Intent(mainpage.this,food.class);
                startActivity(yemek);
            }
        });
        geriset=findViewById(R.id.geri124);
        geriset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sett=new Intent(mainpage.this,setting.class);
                startActivity(sett);
            }
        });
    }
}