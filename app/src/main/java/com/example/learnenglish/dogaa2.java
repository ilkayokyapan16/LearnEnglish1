package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dogaa2 extends AppCompatActivity {
Button gerisifirdokuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogaa2);
        gerisifirdokuz=findViewById(R.id.gerip);
        gerisifirdokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(dogaa2.this,doga.class);
                startActivity(back);
            }
        });
    }
}