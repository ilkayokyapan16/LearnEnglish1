package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);
        btn_Renk=findViewById(R.id.btn_renk);
        btn_Renk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent renk=new Intent(MainActivity.this,activityrenk.class);
                startActivity(renk);
            }
        });
        sayis=findViewById(R.id.btn_sayi);
        sayis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rakamlar=new Intent(MainActivity.this,sayilar.class);
                startActivity(rakamlar);
            }
        });
        dogal=findViewById(R.id.btn_doga);
        dogal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nature=new Intent(MainActivity.this,doga.class);
                startActivity(nature);
            }
        });
        hayvans=findViewById(R.id.btn_hayvan);
        hayvans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animal=new Intent(MainActivity.this,hayvanlar.class);
                startActivity(animal);
            }
        });
        memleket=findViewById(R.id.btn_ulkee);
        memleket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ulke=new Intent(MainActivity.this,ulkeler.class);
                startActivity(ulke);
            }
        });
        techno=findViewById(R.id.btn_tekno);
        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pc=new Intent(MainActivity.this,teknoloji.class);
                startActivity(pc);
            }
        });
        food=findViewById(R.id.btn_yemek);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemek=new Intent(MainActivity.this,yemekler.class);
                startActivity(yemek);
            }
        });
        zanaat=findViewById(R.id.btn_meslek);
        zanaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is=new Intent(MainActivity.this,meslekler.class);
                startActivity(is);
            }
        });
        geriset=findViewById(R.id.geri124);
        geriset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sett=new Intent(MainActivity.this,ayarlar.class);
                startActivity(sett);
            }
        });
    }
}