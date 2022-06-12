package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hayvanlar extends AppCompatActivity {
Button gerionbir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar);
        gerionbir=findViewById(R.id.geri111);
        gerionbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onbir=new Intent(hayvanlar.this,MainActivity.class);
                startActivity(onbir);
            }
        });
    }
}