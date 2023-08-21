package com.Proyecto.Proyecto.service.impl;

import com.Proyecto.Proyecto.dao.CitaDao;
import com.Proyecto.Proyecto.domain.Cita;
import com.Proyecto.Proyecto.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaDao citaDao;

    @Autowired
    public CitaServiceImpl(CitaDao citaDao) {
        this.citaDao = citaDao;
    }

    @Override
    public List<Cita> getAllCitas() {
        return citaDao.findAll();
    }

    public void agregarComentario(Cita asunto) {
        citaDao.save(asunto);
    }

    @Override
    public void agregarCita(Cita cita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
