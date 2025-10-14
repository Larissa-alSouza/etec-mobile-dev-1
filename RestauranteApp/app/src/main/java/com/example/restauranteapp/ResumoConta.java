package com.example.restauranteapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResumoConta extends Activity {

    TextView txtNmesa, txtGarcom, txtTotaltaxa, txtVpessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_conta);

        Conta conta = (Conta) getIntent().getSerializableExtra("conta");

        txtNmesa = findViewById(R.id.txtNmesa);
        txtGarcom = findViewById(R.id.txtGarcom);
        txtTotaltaxa = findViewById(R.id.txtTotaltaxa);
        txtVpessoa = findViewById(R.id.txtVpessoa);

        //Calculos
        double taxa = conta.getVconsumido() * 0.10;
        double total = conta.getVconsumido() + taxa;
        double vppessoa = total / conta.getQtdPessoas();

        //Converte os calculos para strings de novo
        String Nmesa = String.valueOf(conta.getNmesa());
        String taxaG = String.valueOf(taxa);
        String totalV = String.valueOf(total);
        String vapessoa = String.valueOf(vppessoa);

        //Exibe na segunda tela
        txtNmesa.setText("Número da mesa: " + Nmesa);
        txtGarcom.setText("Taxa do garçom: " + taxaG);
        txtTotaltaxa.setText("Valor total: " + totalV);
        txtVpessoa.setText("Valor por pessoa: " + vapessoa);

    }
}
