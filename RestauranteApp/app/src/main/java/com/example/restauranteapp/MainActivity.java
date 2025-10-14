package com.example.restauranteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    EditText edtNmesa, edtVconsumido, edtQtdPessoas;
    Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNmesa = findViewById(R.id.edtNmesa);
        edtVconsumido = findViewById(R.id.edtVconsumido);
        edtQtdPessoas = findViewById(R.id.edtQtdPessoas);
        btnFechar = findViewById(R.id.btnFechar);

    }

    public void enviarDados(View view){
        Conta conta = new Conta();

        int Nmesa = Integer.parseInt(edtNmesa.getText().toString());
        double Vconsumido = Double.parseDouble(edtVconsumido.getText().toString());
        int QtdPessoas =Integer.parseInt(edtQtdPessoas.getText().toString());

        conta.setNmesa(Nmesa);
        conta.setVconsumido(Vconsumido);
        conta.setQtdPessoas(QtdPessoas);

        Intent it = new Intent(this, ResumoConta.class);
        it.putExtra("conta", conta);
        startActivity(it);
    }
}