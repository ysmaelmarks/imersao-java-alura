package com.example;

import com.google.gson.annotations.SerializedName;

public class Filme {

    @SerializedName("title")
    private String titulo;

    @SerializedName("imDbRating")
    private String avaliacao;

    @SerializedName("image")
    private String imagem;

    public Filme() {
    }

    public Filme(String titulo, String avaliacao, String imagem) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao='" + avaliacao + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}