package com.Proyecto.Proyecto.dao.impl;

import com.Proyecto.Proyecto.dao.ForoDao;
import com.Proyecto.Proyecto.domain.Foro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ForoDaoImpl implements ForoDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ForoDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void guardarComentario(Foro foro) {
        String sql = "INSERT INTO foro_comentarios (nombre, tema, comentario) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, foro.getNombre(), foro.getTema(), foro.getComentario());
    }

    @Override
    public List<Foro> obtenerTodosLosComentarios() {
        String sql = "SELECT * FROM foro_comentarios";
        return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
            Foro foro = new Foro();
            foro.setId(resultSet.getInt("id"));
            foro.setNombre(resultSet.getString("nombre"));
            foro.setTema(resultSet.getString("tema"));
            foro.setComentario(resultSet.getString("comentario"));
            return foro;
        });
    }
}

