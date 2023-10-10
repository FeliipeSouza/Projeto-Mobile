package com.example.projeto3.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projeto3.R;

/**Tela iniciada depois de clicar em um card do RecycleView de Artistas */
/**Essa tela apresentara informacoes diferentes correspondente aos artistas em que o usuario clicou */
public class TelaCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_card);

        //Obtem a Intent que iniciou esta atividade
        Intent intent = getIntent();

        /**instancia dos elementos no  layout*/
        TextView textView2 =  findViewById(R.id.textViewCard);
        TextView textView1 =  findViewById(R.id.text_card);
        ImageView imageView = findViewById(R.id.img_card);

        /** Obtem o nome, descricao e imagem do cartao da Intent*/
        String nome = getIntent().getStringExtra("nome");
        String descricao = getIntent().getStringExtra("descricao");
        int image = getIntent().getIntExtra("image",0);

        /** Define o nome, descricao e imagem nos elementos de interface do layout*/
        textView2.setText(nome);
        textView1.setText(descricao);
        imageView.setImageResource(image);
        }
}