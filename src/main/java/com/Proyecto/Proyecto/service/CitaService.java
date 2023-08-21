package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Cita;
import org.springframework.stereotype.Service;

@Service
public interface CitaService {
    void guardarCita(Cita cita);
    // Agregar aquí otros métodos de lógica de negocio relacionados con las citas médicas
}
