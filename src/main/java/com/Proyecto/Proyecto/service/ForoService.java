package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Foro;

import java.util.List;

public interface ForoService {
    List<Foro> getAllComentarios();
    void agregarComentario(Foro comentario);
    // Puedes agregar otros métodos según tus necesidades
}

