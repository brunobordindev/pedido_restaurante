package com.example.cursopedidorestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cafeCoado, cafeExpresso, cafePersonalizado, agua, refri, suco;
    private Button enviar;
    private Button btnMaisCoado, btnMenosCoado, btnMaisExpresso, btnMenosExpresso, btnMaisPersonalizado, btnMenosPersonalizado, btnMaisAgua, btnMenosAgua, btnMaisRefri, btnMenosRefri, btnMaisSuco, btnMenosSuco;
    private LinearLayout visibilityCoado, visibilityExpresso, visibilityPersonalizado, visibilityAgua, visibilityRefri, visibilitySuco;
    private TextView qtdCoado, qtdExpresso, qtdPersonalizado, qtdAgua, qtdRefri, qtdSuco;
    String res, valorTotal;
    Intent i;
    int nCoado, nExpresso, nPersonalizado, nAgua, nRefri, nSuco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cafeCoado = findViewById(R.id.checkBoxCoado);
        cafeExpresso = findViewById(R.id.checkBoxExpresso);
        cafePersonalizado = findViewById(R.id.checkBoxPersonalizado);
        agua = findViewById(R.id.checkBoxAgua);
        refri = findViewById(R.id.checkBoxRefri);
        suco = findViewById(R.id.checkBoxSuco);
        enviar = findViewById(R.id.btnEnviarPedido);
        qtdCoado = findViewById(R.id.qtdCoado);
        qtdExpresso = findViewById(R.id.qtdExpresso);
        qtdPersonalizado = findViewById(R.id.qtdPersonalizado);
        qtdAgua = findViewById(R.id.qtdAgua);
        qtdRefri = findViewById(R.id.qtdRefri);
        qtdSuco = findViewById(R.id.qtdSuco);
        btnMaisCoado = findViewById(R.id.btnMaisCoado);
        btnMenosCoado = findViewById(R.id.btnMenosCoado);
        btnMaisExpresso = findViewById(R.id.btnMaisExpresso);
        btnMenosExpresso = findViewById(R.id.btnMenosExpresso);
        btnMaisPersonalizado = findViewById(R.id.btnMaisPersonalizado);
        btnMenosPersonalizado = findViewById(R.id.btnMenosPersonalizado);
        btnMaisAgua = findViewById(R.id.btnMaisAgua);
        btnMenosAgua = findViewById(R.id.btnMenosAgua);
        btnMaisRefri = findViewById(R.id.btnMaisRefri);
        btnMenosRefri = findViewById(R.id.btnMenosRefri);
        btnMaisSuco = findViewById(R.id.btnMaisSuco);
        btnMenosSuco = findViewById(R.id.btnMenosSuco);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkbox();

                i= new Intent(MainActivity.this, SplashActivity.class);
                i.putExtra("resultado", res);
                i.putExtra("valorTotal", valorTotal);
                startActivity(i);

            }
        });



        btnMaisMenos();

    }

    public void btnMaisMenos(){

        btnMaisCoado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdCoado.getText()));
                 nCoado = n + 1;
                String numeroCoado = Integer.toString(nCoado);
                qtdCoado.setText(numeroCoado);
            }
        });

        btnMenosCoado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdCoado.getText()));
                if (n > 0){
                    nCoado = n - 1;
                    String numeroCoado = Integer.toString(nCoado);
                    qtdCoado.setText(numeroCoado);
                }

            }
        });

        btnMaisExpresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdExpresso.getText()));
                nExpresso = n + 1;
                String numeroExpresso = Integer.toString(nExpresso);
                qtdExpresso.setText(numeroExpresso);
            }
        });

        btnMenosExpresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdExpresso.getText()));
                if (n > 0){
                    nExpresso= n - 1;
                    String numeroExpresso= Integer.toString(nExpresso);
                    qtdExpresso.setText(numeroExpresso);
                }

            }
        });

        btnMaisPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdPersonalizado.getText()));
                nPersonalizado = n + 1;
                String numeroPersonalizado= Integer.toString(nPersonalizado);
                qtdPersonalizado.setText(numeroPersonalizado);
            }
        });

        btnMenosPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdPersonalizado.getText()));
                if (n > 0){
                    nPersonalizado= n - 1;
                    String numeroPersonalizado = Integer.toString(nPersonalizado);
                    qtdPersonalizado.setText(numeroPersonalizado);
                }

            }
        });

        btnMaisAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdAgua.getText()));
                nAgua = n + 1;
                String numeroAgua = Integer.toString(nAgua);
                qtdAgua.setText(numeroAgua);
            }
        });

        btnMenosAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdAgua.getText()));
                if (n > 0){
                    nAgua= n - 1;
                    String numeroAgua = Integer.toString(nAgua);
                    qtdAgua.setText(numeroAgua);
                }

            }
        });

        btnMaisRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdRefri.getText()));
                nRefri = n + 1;
                String numeroRefri = Integer.toString(nRefri);
                qtdRefri.setText(numeroRefri);
            }
        });

        btnMenosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdRefri.getText()));
                if (n > 0){
                    nRefri = n - 1;
                    String numeroRefri = Integer.toString(nRefri);
                    qtdRefri.setText(numeroRefri);
                }

            }
        });

        btnMaisSuco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(String.valueOf(qtdSuco.getText()));
                nSuco= n + 1;
                String numeroSuco = Integer.toString(nSuco);
                qtdSuco.setText(numeroSuco);
            }
        });

        btnMenosSuco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(qtdSuco.getText()));
                if (n > 0){
                    nSuco = n - 1;
                    String numeroSuco = Integer.toString(nSuco);
                    qtdSuco.setText(numeroSuco);
                }

            }
        });

    }

    public void checkbox(){
        String texto = " ", somaCoado = null, somaExpresso = null, somaPersolizado = null, somaAgua = null, somaRefri = null, somaSuco = null;
        double soma = 0;

        if (cafeCoado.isChecked()){
            String opcaoSelecionada = cafeCoado.getText().toString();
            double prod = 5 * nCoado;
            soma = prod;
            somaCoado = Double.toString(prod);
            texto = nCoado + " - " + opcaoSelecionada + " R$" + somaCoado + " \n"  ;
        }

        if (cafeExpresso.isChecked()){
            String opcaoSelecionada = cafeExpresso.getText().toString();
            double prod = 6 * nExpresso;
            soma = soma + prod;
            somaExpresso = Double.toString(prod);
            texto = texto + nExpresso + " - " + opcaoSelecionada + " R$" + somaExpresso + " \n"  ;
        }

        if (cafePersonalizado.isChecked()){
            String opcaoSelecionada = cafePersonalizado.getText().toString();
            double prod = 8 * nPersonalizado;
            soma = soma + prod;
            somaPersolizado = Double.toString(prod);
            texto = texto + nPersonalizado + " - " + opcaoSelecionada + " R$" + somaPersolizado + " \n"  ;
        }

        if (agua.isChecked()){
            String opcaoSelecionada = agua.getText().toString();
            double prod = 5 * nAgua;
            soma = soma + prod;
            somaAgua = Double.toString(prod);
            texto = texto + nAgua + " - " + opcaoSelecionada + " R$" + somaAgua + " \n"  ;
        }

        if (refri.isChecked()){
            String opcaoSelecionada = refri.getText().toString();
            double prod = 5.5 * nRefri;
            soma = soma + prod;
            somaRefri = Double.toString(prod);
            texto = texto +  nRefri + " - " +opcaoSelecionada + " R$" + somaRefri + " \n"  ;
        }

        if (suco.isChecked()){
            String opcaoSelecionada = suco.getText().toString();
            double prod = 7 * nSuco;
            soma = soma + prod;
            somaSuco = Double.toString(prod);
            texto = texto +  nSuco+ " - " +opcaoSelecionada + " R$" + somaSuco + " \n"  ;
        }

        res = texto;
        double valor = soma;
        valorTotal = Double.toString(valor);
    }

}