package com.example.helloandroidtb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    //DECLARANDO VARIÁVEL
    Button btnexibe;
    TextView txtexibenome;
    EditText edtnome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // INDICANDO QUAL LAYOUT UTILIZAR
        setContentView(R.layout.activity_main);


        // INSTANCIANDO OS COMPONENTES DO LAYOUT XML
        btnexibe = (Button) findViewById(R.id.btnexibe);
        txtexibenome = (TextView) findViewById(R.id.txtexibenome);
        edtnome = (EditText) findViewById(R.id.edtnome);


        //REGISTRANDO O EVENTO DE CLICK DO BOTÃO
        btnexibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              txtexibenome.setText(edtnome.getText().toString());
            }
        });

    }
}