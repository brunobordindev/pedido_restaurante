package com.example.cursopedidorestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        i = getIntent();
        String resultado = i.getExtras().getString("resultado");
        String valorTotal = i.getExtras().getString("valorTotal");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                i = new Intent(SplashActivity.this, MainActivity2.class);
                i.putExtra("resultado", resultado);
                i.putExtra("valorTotal", valorTotal);
                startActivity(i);
            }
        }, 3000);




    }
}