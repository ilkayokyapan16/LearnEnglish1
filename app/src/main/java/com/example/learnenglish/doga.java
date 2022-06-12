package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doga extends AppCompatActivity {
Button gerido;
Button ileri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doga);
        gerido=findViewById(R.id.geri905);
        gerido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gerio=new Intent(doga.this,MainActivity.class);
                startActivity(gerio);
            }
        });
        ileri=findViewById(R.id.ileri22);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ileriz=new Intent(doga.this,dogaa2.class);
                startActivity(ileriz);
            }
        });
    }
}