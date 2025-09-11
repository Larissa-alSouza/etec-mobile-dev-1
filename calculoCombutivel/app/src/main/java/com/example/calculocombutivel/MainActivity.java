package com.example.calculocombutivel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textltgasolina;
    TextView textltetanol;
    TextView textqtdlt;
    Button btncalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textltgasolina = (TextView) findViewById(R. id. ltgasolina);
        textltetanol = (TextView) findViewById(R.id. ltetanol);
        textqtdlt = (TextView) findViewById(R.id. qtdlt);
        btncalculo = (Button) findViewById(R.id. calculo);

        String ltgas = textltgasolina.getText().toString();
        String ltet = textltetanol.getText().toString();
        String qtd = textqtdlt.getText().toString();

        double x = (Double.parseDouble(ltgas) / Double.parseDouble(ltet));

        double y = (Double.parseDouble(ltet));
        double z = (Double.parseDouble(ltgas));
        double qtdconvert = (Double.parseDouble(qtd));


        btncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(x < 0.7)
                {
                    double total = qtdconvert * y;
                    Toast.makeText(MainActivity.this, "Compensa com etanol. Valor total: " + total, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double total = qtdconvert * z;
                    Toast.makeText(MainActivity.this, "Compensa gasolina. Valor total: " + total, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}