package com.example.appposto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

    EditText textltgasolina;
    EditText textltetanol;
    EditText textqtdlt;
    Button btncalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textltgasolina = (EditText) findViewById(R.id.ltgasolina);
        textltetanol = (EditText) findViewById(R.id.ltetanol);
        textqtdlt = (EditText) findViewById(R.id.qtdlt);
        btncalculo = (Button) findViewById(R.id.btncalculo);


        btncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ltgas = textltgasolina.getText().toString();
                String ltet = textltetanol.getText().toString();
                String qtd = textqtdlt.getText().toString();


                double x = (Double.parseDouble(ltgas) / Double.parseDouble(ltet));

                double y = (Double.parseDouble(ltet));
                double z = (Double.parseDouble(ltgas));
                double qtdconvert = (Double.parseDouble(qtd));

                double total = 0;

                if(x < 0.7)
                {
                    total = qtdconvert * y;
                    Toast.makeText(MainActivity.this, "Compensa abastecer com etanol. Valor total: R$" + total, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    total = qtdconvert * z;
                    Toast.makeText(MainActivity.this, "Compensa abastecer com gasolina. Valor total: R$" + total, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}