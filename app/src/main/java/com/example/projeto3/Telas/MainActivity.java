package com.example.projeto3.Telas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.projeto3.R;
import com.example.projeto3.adapters.Adapter;
import com.example.projeto3.adapters.AdapterPatro;
import com.example.projeto3.entities.Artistas2;
import com.example.projeto3.entities.Patrocinadores;

import java.util.ArrayList;

/** Essa e a classe principal da aplicacao */
public class MainActivity extends AppCompatActivity  {
    //DownTown   */

    /**Criacao de Arraylists do tipo "classe" para a transmissao de dados */
    ArrayList<Patrocinadores> patrocinadores= new ArrayList<>();
    /**Foram criadas 2 arrays, um para cada RecycleView  */
    ArrayList<Artistas2> artistas2 = new ArrayList<>();



    /**array de imagens, que sera utilizado no metodo setUpArtistas */
    int[] imgCantores ={R.drawable.cold,R.drawable.topp,R.drawable.wave,R.drawable.bruno,
            R.drawable.five_sos,R.drawable.dani,R.drawable.chase,R.drawable.dpr};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appbar_reci);


        /**Instancias de imagens localizadas no toolbar */

        ImageView imageViewButton1 = findViewById(R.id.calendarIcon);
         ImageView imageViewButton2 = findViewById(R.id.localIcon);
         ImageView imageViewButton3 = findViewById(R.id.perfilIcon);

        /**Cada imagem tera um evento de clique,levando o usuario para outra tela  */
        /**Evento de clique para ir para a tela de Programacao  */
        imageViewButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgramacaoTela.class);
                startActivity(intent);
            }
        });

        /**Evento de clique para ir para a tela de localizacao  */
        imageViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LocalAct.class);
                startActivity(intent);
            }
        });

        /**Evento de clique para ir para a tela de Perfil  */
        imageViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PerfilAct.class);
                startActivity(intent);
            }
        });


        /**Instancias do recicleView */
        RecyclerView recyclerView1 = findViewById(R.id.recyclerView1);
        RecyclerView recyclerView2 = findViewById(R.id.recycle2);

        /**Chamada de metodos (linha 100 e 109)  */
        setUpArtistas();
        setUpPatrocinadores();

        /**Intancias das classes adapters*/
        /**Preciso informar qual arraylist vai ser passado em cada instancia do adapter  */
        Adapter adapter = new Adapter(this, artistas2);
        AdapterPatro adapterPatr = new AdapterPatro(this, patrocinadores);

        /**setando o adapter nos recycleViews  */
        recyclerView1.setAdapter(adapter);
        recyclerView1.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerView2.setAdapter(adapterPatr);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

    }
    /**Esses metodos irao incrementar os dados em meu arraylist
     * serao adicionados no arraylist de acordo com o for , presente no metodo, na posicao i.
     * Existe um arquivo chamado strings.xml, localizado no diretorio values. Nesse arquivo estao
     * contidos arrays de Strings
     * */
    public void setUpArtistas(){
        String[] artistastring = getResources().getStringArray(R.array.bandas_nomes);
        String[] artistasDescr = getResources().getStringArray(R.array.banda_descricao);
        String[] artistasTitSem = getResources().getStringArray(R.array.bandas_nomes_sem);
        for (int i = 0; i < artistastring.length; i++){
            artistas2.add(new Artistas2(artistastring[i],artistasDescr[i] ,artistasTitSem[i],imgCantores[i]));
        }
    }
    /**metodo para a adicao de imagens no array */
    public void setUpPatrocinadores(){
        int[] imgsPatro =  {R.drawable.ambev,R.drawable.samsung,R.drawable.ifood,R.drawable.tim,
                R.drawable.uber};
        for (int i = 0; i < imgsPatro.length; i++){
            patrocinadores.add(new Patrocinadores(imgsPatro[i]));
        }
    }
}
