package com.example.projeto3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto3.R;
import com.example.projeto3.entities.Patrocinadores;

import java.util.ArrayList;
/** Esta classe é um adapter  para o RecyclerView que exibe uma lista do tipo "Artistas"*/
/**Mesmo conceitos utilizados na classe Adapter*/
public class AdapterPatro extends RecyclerView.Adapter<AdapterPatro.MyviewHolder3>{
    Context context2;
    ArrayList<Patrocinadores> listaPatro;

   public AdapterPatro(Context context2, ArrayList<Patrocinadores> listaPatro){
       this.context2 = context2;
       this.listaPatro = listaPatro;
   }

    @NonNull
    @Override
    public MyviewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context2);
        View view = layoutInflater.inflate(R.layout.recy_patro,parent,false);

        return new MyviewHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder3 holder, int position) {
        holder.imageViewPatro.setImageResource(listaPatro.get(position).getImagensPatr());
    }

    @Override
    public int getItemCount() {
        return listaPatro.size();
    }

    public static  class MyviewHolder3 extends RecyclerView.ViewHolder{

        public MyviewHolder3(@NonNull View itemView) {
            super(itemView);
        }
        ImageView imageViewPatro = itemView.findViewById(R.id.imageViewReViPatro);
    }

}
