package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nature extends AppCompatActivity {
    Button gerido;
    Button ileri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);
        gerido=findViewById(R.id.geri905);
        gerido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gerio=new Intent(nature.this,mainpage.class);
                startActivity(gerio);
            }
        });
    }
}