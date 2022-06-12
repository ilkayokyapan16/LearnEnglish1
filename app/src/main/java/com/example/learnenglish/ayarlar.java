package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ayarlar extends AppCompatActivity {
Button gerid;
Button ceviri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);
        gerid=findViewById(R.id.geri9991);
        gerid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geria= new Intent(ayarlar.this,MainActivity.class);
                startActivity(geria);
            }
        });
        ceviri=findViewById(R.id.button6);
        ceviri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cevir=new Intent(ayarlar.this,setting.class);
                startActivity(cevir);
            }
        });

    }
}