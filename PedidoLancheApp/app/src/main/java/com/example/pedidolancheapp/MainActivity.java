package com.example.pedidolancheapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText edtNome;
    RadioGroup rgOpcoes;
    CheckBox ckbBatata, ckbRefri;
    Spinner spnTamanho;
    SeekBar sbkMolho;
    TextView txtValor;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        rgOpcoes = findViewById(R.id.rgopcoes);
        ckbBatata = findViewById(R.id.ckbBatata);
        ckbRefri = findViewById(R.id.ckbRefri);
        txtValor = findViewById(R.id.txtvalor);
        spnTamanho = findViewById(R.id.spnTamanho);
        sbkMolho = findViewById(R.id.sbkMolho);

        configuraSeekBar();
        configuraSpinner();
    }

    public void configuraSeekBar(){
        sbkMolho.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtValor.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void configuraSpinner(){

        String[] nomes = new String[]{"Pequeno", "Médio", "Grande"};

        //Criar um adaptador para o Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,nomes);

        //Definir o layout do Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Associar o adaptador ao Spinner
        spnTamanho.setAdapter(adapter);
    }

    public void finalizar(){
        Pedido pedido = new Pedido();
    }
}