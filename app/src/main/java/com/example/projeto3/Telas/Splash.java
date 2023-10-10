package com.example.projeto3.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.projeto3.R;
/**Tela de carregamento do aplicativo */
public class Splash extends AppCompatActivity {
    /** Handler utilizado para controlar o atraso na transição para a tela principal */
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        //intancia do handler
        handler= new Handler();

        /** Define um atraso de 3 segundos para a transicao para a tela principal */
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /**criacao do intent para ir para a tela principal */
                Intent intent = new Intent(Splash.this, MainActivity.class);
                /**iniciando a activity */
                startActivity(intent);
                /**finaliza a activity da splash, evita que o usuario retorne para ela apos o iniciar */
                finish();
            }},3000);




    }
}