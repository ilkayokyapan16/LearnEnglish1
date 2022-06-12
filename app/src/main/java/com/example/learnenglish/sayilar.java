package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayilar extends AppCompatActivity {
Button kırkdort;
Button ilerii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar);
    kırkdort=findViewById(R.id.geri449);
    kırkdort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent kırk=new Intent(sayilar.this,MainActivity.class);
            startActivity(kırk);
        }
    });
    ilerii=findViewById(R.id.ileri68);
    ilerii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ilerisi=new Intent(sayilar.this,sayilar2.class);
            startActivity(ilerisi);
        }
    });
    }
}