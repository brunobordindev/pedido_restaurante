package com.example.cursopedidorestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView resultado, valor;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = findViewById(R.id.resultadoPedido);
        valor = findViewById(R.id.valor);

        i = getIntent();

        resultado.setText(i.getExtras().getString("resultado"));
        valor.setText("Total R$ " + i.getExtras().getString("valorTotal"));
    }
}