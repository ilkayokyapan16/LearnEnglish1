package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meslekler extends AppCompatActivity {
Button sifiriki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meslekler);
       sifiriki=findViewById(R.id.geri029);
       sifiriki.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent iki=new Intent(meslekler.this,MainActivity.class);
               startActivity(iki);
           }
       });
    }
}