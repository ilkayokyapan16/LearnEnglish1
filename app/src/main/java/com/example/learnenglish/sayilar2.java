package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayilar2 extends AppCompatActivity {
Button sifiruc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar2);
    sifiruc=findViewById(R.id.geri0313);
    sifiruc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent uc=new Intent(sayilar2.this,sayilar.class);
            startActivity(uc);
        }
    });
    }
}