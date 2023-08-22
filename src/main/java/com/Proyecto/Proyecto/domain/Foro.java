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
    @Column(name = "idforo")
    private int idForo;
    private String comentario;
    private String nombre;
    private String tema;

    public int getId() {
        return idForo;
    }

    public String getComentario() {
        return comentario;
    }
    
    public void setId(int id) {
        this.idForo = id;
        
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    

    

    @Override
    public String toString() {
        return "Foro{"
                + "idForo=" + idForo
                + ", comentario='" + comentario + '\''
                + ", nombre='" + nombre + '\''
                + ", tema='" + tema + '\''
                + '}';
    }
}
