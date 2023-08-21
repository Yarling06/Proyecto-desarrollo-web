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
@Table (name=" solicitarcita")
public class Cita implements Serializable {
    
    private static final long  serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id_cita")
    private int idCita;
    private String asunto;
    private String telefono;
    private String especialista;
    private  String fecha_cita;
    private String comentario;


    public int getId() {
        return idCita;
    }

    public void setId(int id) {
        this.idCita = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita= fecha_cita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
@Override
    public String toString() {
        return "Cita{" +
                "idCita=" + idCita +
                ", asunto='" + asunto + '\'' +
                ", telefono='" + telefono+ '\'' +
                ", especialista='" + especialista + '\'' +
                 ", fecha_cita='" + fecha_cita+ '\'' +
                 ", comentario='" + comentario + '\'' +
                '}';
}
}