package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numbers extends AppCompatActivity {
    Button kırkdort;
    Button ilerii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        kırkdort=findViewById(R.id.geri449);
        kırkdort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kırk=new Intent(numbers.this,mainpage.class);
                startActivity(kırk);
            }
        });
        ilerii=findViewById(R.id.ileri68);
        ilerii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilerisi=new Intent(numbers.this,numbers2.class);
                startActivity(ilerisi);
            }
        });
    }
}