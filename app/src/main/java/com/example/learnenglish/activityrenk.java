package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityrenk extends AppCompatActivity {
Button gerisifir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityrenk);
        gerisifir=findViewById(R.id.geri9991);
        gerisifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri= new Intent(activityrenk.this,MainActivity.class);
                startActivity(geri);
            }
        });
    }
}