package com.example.fixao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnvEmail(View view){
        Intent intent = new Intent(MainActivity.this, Email.class);
        startActivity(intent);
    }

    public void Chamar(View view){
        Intent intent = new Intent(MainActivity.this, Telefone.class);
        startActivity(intent);
    }

    public void Mapa(View view){
        Intent intent = new Intent(MainActivity.this, Mapa.class);
        startActivity(intent);
    }
}
