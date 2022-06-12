package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teknoloji extends AppCompatActivity {
Button sifirdort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknoloji);
    sifirdort=findViewById(R.id.geri0460);
    sifirdort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent dort=new Intent(teknoloji.this,MainActivity.class);
            startActivity(dort);
        }
    });
    }
}