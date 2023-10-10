package com.example.projeto3.adapters;



import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto3.R;
import com.example.projeto3.Telas.TelaCard;
import com.example.projeto3.entities.Artistas2;

import java.util.ArrayList;
 /**Esta classe e um adapter para o RecyclerView que exibe uma lista do tipo "Artistas."
  * Ele e responsavel pela criacao de elementos de visualizacao e vinculacao de dados no recycleview.*/
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder2>  {
    /**serve para armazenar uma referencia a uma activity(tela) em que se utiliza esse adapter*/
    Activity contexto;
    /**Esse arraylist serve para armazenar uma lista de objetos da classe Artistas*/
    ArrayList<Artistas2> artistas2s;

/**Construtor do adapter*/
    public Adapter(Activity contexto, ArrayList<Artistas2> artistas2s) {
        this.contexto = contexto;
        this.artistas2s = artistas2s;
    }

     /**Esse metodo e responsavel por criar novos objetos de visualizacao
      que representam os itens individuais em um RecyclerView.
      Chamado quando uma nova instancia de MyViewHolder2 e criada.*/
    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //O LayoutInflater é usado para criar layouts xml em objetos de visualizacao reais.
        LayoutInflater inflater = LayoutInflater.from(contexto);
        /** O inflate é usado para inflar o layout definido no arquivo: recy bandas em um objeto View
         * Criando uma nova visualizacao com base no layout informado */
        View view = inflater.inflate(R.layout.recy_bandas, parent, false);
        return new MyViewHolder2(view);
    }


     /**Metodo chamado sempre que um novo item precisa ser exibido ou atualizado
      * define a imagem e textos com base nos dados dos artistas na posicao atual da lista(position).
      *
      * A imagem e texto relacionados ao artistas serao definidos para o artista correspondente
      * naquela posicao*/
     @Override
     public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
             holder.imageView.setImageResource(artistas2s.get(holder.getAdapterPosition()).getImagem());
             holder.txtView.setText(artistas2s.get(holder.getAdapterPosition()).getTexto());
             holder.cardView.setOnClickListener(new View.OnClickListener() {
                 /**Ao clicar em um Card dentro do recycleview,o usuario sera transmitido para outra tela*/
                 @Override
                 public void onClick(View view) {
                     /**informando a intencao, e qual tela o usuario será trasportado*/
                     Intent intent = new Intent(view.getContext(), TelaCard.class);
                     //os putExtras são infromacoes extras que serao passadas para a proxima tela
                     /**putextra para o nome da banda*/
                     intent.putExtra("nome",artistas2s.get(holder.getAdapterPosition()).getTit());
                     /**putextra para a descricao da banda*/
                     intent.putExtra("descricao",artistas2s.get(holder.getAdapterPosition()).getDescricao());
                     /**putextra para a imagem da banda*/
                     intent.putExtra("image",artistas2s.get(holder.getAdapterPosition()).getImagem());
                     /**inicializando a activity*/
                     view.getContext().startActivity(intent);
                 }
             });
         }

/** Retorna o numero total de itens na lista de artistas2s.*/
    @Override
    public int getItemCount() {
        return  artistas2s.size();
    }

/** Classe presente no Adapter que representa os elementos de visualizacao do RecyclerView.*/
    public static class MyViewHolder2 extends RecyclerView.ViewHolder {
        /**Instancias que representarao referencias aos elementos da interface*/
        ImageView imageView;
        TextView txtView;
        CardView cardView;

        /** @param itemView representa a visualizacao raiz do item de lista */
        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);

            /**inicializaçoes de intancias referentes a cada elemento presente no item da lista*/
            imageView = itemView.findViewById(R.id.imageViewReVi);
            txtView = itemView.findViewById(R.id.textViewReVi);
            cardView=itemView.findViewById(R.id.card_bandas);
        }
    }

    }

