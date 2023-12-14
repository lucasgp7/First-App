package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapp.MainActivity;

public class SobreActivity extends AppCompatActivity {

    private int contador;
    private TextView textContador;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);


        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SobreActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        TextClock textClock = findViewById(R.id.textClock);
        textClock.setTimeZone("GMT-3:00");

        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        textContador = findViewById(R.id.textContador);
        textContador.setText(String.valueOf(contador));
    }
}
