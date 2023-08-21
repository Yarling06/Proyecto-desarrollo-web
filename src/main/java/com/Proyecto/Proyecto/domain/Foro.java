package com.Proyecto.Proyecto.domain;

 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

 

@Data
@Entity
@Table(name = "foro")
public class Foro implements Serializable {

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_foro")
    private int idForo;
    private String nombre;
    private String tema;
    private String comentario;


 

    public int getId() {
        return idForo;
    }

 

    public void setId(int id) {
        this.idForo = id;
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
        return "Foro{"
                + "idForo=" + idForo
                + ", nombre='" + nombre + '\''
                + ", tema='" + tema + '\''
                + ", comentario='" + comentario + '\''
                + '}';
    }
}