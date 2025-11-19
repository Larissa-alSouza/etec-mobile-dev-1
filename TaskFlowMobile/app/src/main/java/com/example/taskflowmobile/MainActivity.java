package com.example.taskflowmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    EditText edtTitulo;
    RadioGroup rgOpcoes;
    CheckBox ckbImportante;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTitulo = findViewById(R.id.edtTitulo);
        rgOpcoes = findViewById(R.id.rgopcoes);
        ckbImportante = findViewById(R.id.ckbImportante);


    }

    public void enviarDados(View view){
        Conta conta = new Conta();

        String titulo = edtTitulo.getText().toString();

        int idSelecionado = rgOpcoes.getCheckedRadioButtonId();

        String opcao = "";
        if (idSelecionado != -1) { // -1 significa que nenhum RadioButton foi selecionado
            RadioButton radioSelecionado = findViewById(idSelecionado);
            opcao = radioSelecionado.getText().toString();
        }

        boolean importante = ckbImportante.isChecked(); // true se marcado, false se não
        String importanteTexto = importante ? "Sim" : "Não";

        conta.setTitulo(titulo);
        conta.setOpcao(opcao);
        conta.setImportanteTexto(importanteTexto);

        Intent it = new Intent(this, ResumoTarefa.class);
        it.putExtra("conta", conta);
        startActivity(it);

    }
}