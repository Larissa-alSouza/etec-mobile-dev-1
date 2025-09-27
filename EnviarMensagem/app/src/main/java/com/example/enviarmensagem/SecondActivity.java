package com.example.enviarmensagem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {

    TextView txtmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Definir o layout
        setContentView(R.layout.activity_second);

        //Instanciar o TextView
        txtmsg = (TextView) findViewById(R.id.exibeMensagem);

        //Receber a mensagem da MainActivity
        Bundle bundle = getIntent().getExtras();

        //Exibir a mensagem na tela
        if(bundle != null){
            txtmsg.setText("Mensagem: " + bundle.getString("msg"));
        }

    }
}