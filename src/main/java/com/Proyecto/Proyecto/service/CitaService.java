package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Cita;
import org.springframework.stereotype.Service;

@Service
public interface CitaService {
    public void save(Cita cita);
    
}
