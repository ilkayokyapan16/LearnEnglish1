package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yemekler extends AppCompatActivity {
Button alti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekler);
    alti=findViewById(R.id.geri619);
    alti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent altii=new Intent(yemekler.this,MainActivity.class);
            startActivity(altii);
        }
    });
    }
}