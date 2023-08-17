package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Foro;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ForoService {
    List<Foro> getAllComentarios();
    void agregarComentario(Foro comentario);
    // Puedes agregar otros métodos según tus necesidades
}

