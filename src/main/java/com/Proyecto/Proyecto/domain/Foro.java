package com.Proyecto.Proyecto.domain;

public class Foro {
    private int id;
    private String nombre;
    private String tema;
    private String comentario;

    public Foro() {
    }

    public Foro(int id, String nombre, String tema, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.tema = tema;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    @Override
    public String toString() {
        return "Foro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tema='" + tema + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
