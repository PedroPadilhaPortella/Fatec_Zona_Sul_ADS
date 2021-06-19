package com.example.fatecmobile.modelos;

import java.io.Serializable;

public class LivroBean implements Serializable {

    String id;
    String titulo;
    String autor;
    String editora;
    String genero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.titulo + "\n" + this.autor + ",  " + this.editora + "\n" + this.genero;
    }
}
