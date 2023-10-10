package com.example.projeto3.entities;

import android.app.Activity;

import java.io.Serializable;

/**classe de abstracao para o Recycleview de patrocinadores*/
public class Artistas2   {

    String texto;
    String tit;
    String descricao;
    int imagem;

   /** Contrutor da classe */
    public Artistas2(String texto,String descricao,String tit,int imagem) {
        this.imagem = imagem;
        this.texto = texto;
        this.descricao = descricao;
        this.tit = tit;
    }


/**    getters da classe*/
    public String getTit() {
        return tit;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public String getTexto() {
        return texto;
    }

}
