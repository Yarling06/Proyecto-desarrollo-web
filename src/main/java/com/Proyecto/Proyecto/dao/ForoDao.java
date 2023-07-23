package com.Proyecto.Proyecto.dao;

import com.Proyecto.Proyecto.domain.Foro;
import java.util.List;

public interface ForoDao {

    void guardarComentario(Foro foro);

    /**
     * Obtiene todos los comentarios almacenados en la base de datos.
     *
     * @return Una lista de todos los comentarios.
     */
    List<Foro> obtenerTodosLosComentarios();
}
