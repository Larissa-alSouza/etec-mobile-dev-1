package com.example.taskflowmobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResumoTarefa extends Activity {

    TextView txtTitulo, txtOpcao, txtImportante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_tarefa);

        Conta conta = (Conta) getIntent().getSerializableExtra("conta");

        txtTitulo = findViewById(R.id.txtTitulo);
        txtOpcao = findViewById(R.id.txtOpcao);
        txtImportante = findViewById(R.id.txtImportante);

        txtTitulo.setText("Título: " + conta.getTitulo());
        txtOpcao.setText("Prioridade: " + conta.getOpcao());
        txtImportante.setText("Importante? " + conta.getImportanteTexto());
    }
}