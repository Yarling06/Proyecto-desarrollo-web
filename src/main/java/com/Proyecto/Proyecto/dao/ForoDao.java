package com.Proyecto.Proyecto.dao;

import com.Proyecto.Proyecto.domain.Foro;
import java.util.List;

public interface ForoDao {
    void guardarComentario(Foro foro);
    List<Foro> obtenerTodosLosComentarios();
}
