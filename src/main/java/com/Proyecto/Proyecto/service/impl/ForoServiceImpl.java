package com.Proyecto.Proyecto.service.impl;

import com.Proyecto.Proyecto.dao.ForoDao;
import com.Proyecto.Proyecto.domain.Foro;
import com.Proyecto.Proyecto.service.ForoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForoServiceImpl implements ForoService {

    private final ForoDao foroDao;

    @Autowired
    public ForoServiceImpl(ForoDao foroDao) {
        this.foroDao = foroDao;
    }

    @Override
    public List<Foro> getAllComentarios() {
        return foroDao.findAll();
    }

    @Override
    public void agregarComentario(Foro comentario) {
        foroDao.save(comentario);
    }
}

