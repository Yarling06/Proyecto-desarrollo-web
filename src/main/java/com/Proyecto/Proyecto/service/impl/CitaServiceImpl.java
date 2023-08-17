package com.Proyecto.Proyecto.service.impl;

import com.Proyecto.Proyecto.dao.CitaDao;
import com.Proyecto.Proyecto.domain.Cita;
import com.Proyecto.Proyecto.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitaServiceImpl implements CitaService {
    private final CitaDao citaDao;

    @Autowired
    public CitaServiceImpl(CitaDao citaDao) {
        this.citaDao = citaDao;
    }

    @Transactional
    @Override
    public void guardarCita(Cita cita) {
        citaDao.save(cita);
    }
}
