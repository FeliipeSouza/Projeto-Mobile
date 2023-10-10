package com.example.projeto3.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.projeto3.R;

/**Tela do preogramacao do evento */
public class ProgramacaoTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programacao);
        ImageView imageViewButton2 = findViewById(R.id.botaoPr2Dois);
        ImageView imageViewButton3 = findViewById(R.id.perfilIcon);
        ImageView imageViewButton4 = findViewById(R.id.localIcon);

        /**Eventos de clique para ir para outras telas, imagens de clique presentes na toolbar  */
        imageViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProgramacaoTela.this, MainActivity.class);
                startActivity(intent);
            }
        });
        imageViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProgramacaoTela.this,PerfilAct.class);
                startActivity(intent);
            }
        });
        imageViewButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProgramacaoTela.this,LocalAct.class);
                startActivity(intent);
            }
        });



    }
}