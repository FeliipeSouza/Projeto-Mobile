package com.example.projeto3.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.projeto3.R;

/**Tela de localizacao do evento  */
public class LocalAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_layout);
        ImageView imageViewButton2 = findViewById(R.id.botaoPr2Dois);
        ImageView imageViewButton3 = findViewById(R.id.calendarIcon);
        ImageView imageViewButton4 = findViewById(R.id.perfilIcon);

        /**Eventos de clique para ir para outras telas. imagens de clique presentes na toolbar  */
        imageViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalAct.this, MainActivity.class);
                startActivity(intent);
            }
        });
        imageViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalAct.this, ProgramacaoTela.class);
                startActivity(intent);
            }
        });
        imageViewButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalAct.this,PerfilAct.class);
                startActivity(intent);
            }
        });



    }
}