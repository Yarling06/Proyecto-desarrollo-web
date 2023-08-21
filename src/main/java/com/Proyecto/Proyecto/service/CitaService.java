package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Cita;

import java.util.List;

public interface CitaService {

    List<Cita> getAllCitas();

    void agregarCita(Cita cita);
}
