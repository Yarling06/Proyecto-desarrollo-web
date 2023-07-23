package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Foro;
import java.util.List;

public interface ForoService {

    void guardarComentario(Foro foro);

    List<Foro> obtenerTodosLosComentarios();
}
