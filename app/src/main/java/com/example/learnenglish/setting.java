package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class setting extends AppCompatActivity {
    Button gerid;
    Button translate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        gerid=findViewById(R.id.geri9991);
        gerid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geria= new Intent(setting.this,mainpage.class);
                startActivity(geria);
            }
        });
        translate=findViewById(R.id.button6);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tra=new Intent(setting.this,ayarlar.class);
                startActivity(tra);
            }
        });
    }
}