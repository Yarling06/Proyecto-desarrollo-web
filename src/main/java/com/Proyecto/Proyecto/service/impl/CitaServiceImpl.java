package com.Proyecto.Proyecto.service.impl;

import com.Proyecto.Proyecto.dao.CitaDao;
import com.Proyecto.Proyecto.domain.Cita;
import com.Proyecto.Proyecto.service.CitaService;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImpl implements CitaService {
    private final CitaDao citaDao;

    // Constructor para inyectar la dependencia CitaDao
    public CitaServiceImpl(CitaDao citaDao) {
        this.citaDao = citaDao;
    }

    @Override
    public void guardarCita(Cita cita) {
        // Aquí se pueden realizar validaciones adicionales antes de guardar la cita
        citaDao.guardarCita(cita);
    }

    // Implementar aquí otros métodos de lógica de negocio relacionados con las citas médicas
}

