package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Cita;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CitaService {
    void guardarCita(Cita cita);
    // Otros métodos de servicio si es necesario
}
