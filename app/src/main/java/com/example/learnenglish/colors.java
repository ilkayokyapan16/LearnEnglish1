package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colors extends AppCompatActivity {
    Button gerisifirr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        gerisifirr=findViewById(R.id.geri9991);
       gerisifirr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent geri= new Intent(colors.this,mainpage.class);
               startActivity(geri);
           }
       });


    }
}