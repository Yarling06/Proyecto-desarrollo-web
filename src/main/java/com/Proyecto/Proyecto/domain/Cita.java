package com.Proyecto.Proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Data;

@Data
@Entity
@Table(name = "cita")
public class Cita implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Cita")
    private int id_Cita;
    private int id;
    private String asunto;
    private String telefono;
    private String especialista;
    private Timestamp fecha_hora;
    private String comentario;
    
    public Cita() {
    }

    public Cita(int id, String asunto, String telefono, String especialista, Timestamp fecha_hora, String comentario) {
        this.id = id;
        this.asunto = asunto;
        this.telefono = telefono;
        this.especialista = especialista;
        this.fecha_hora = fecha_hora;
        this.comentario = comentario;
    }
    
}
