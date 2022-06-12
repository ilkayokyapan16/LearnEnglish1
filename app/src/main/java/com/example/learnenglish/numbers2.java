package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numbers2 extends AppCompatActivity {
Button sifirucyuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);
    sifirucyuz=findViewById(R.id.geri0313);
    sifirucyuz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent gerio=new Intent(numbers2.this,numbers.class);
            startActivity(gerio);
        }
    });
    }
}