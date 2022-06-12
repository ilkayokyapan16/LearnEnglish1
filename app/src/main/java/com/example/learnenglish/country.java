package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class country extends AppCompatActivity {
    Button bes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        bes=findViewById(R.id.geri501);
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bess=new Intent(country.this,mainpage.class);
                startActivity(bess);
            }
        });
    }
}