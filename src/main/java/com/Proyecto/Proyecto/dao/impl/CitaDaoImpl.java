package com.Proyecto.Proyecto.dao.impl;


import com.Proyecto.Proyecto.dao.CitaDao;
import com.Proyecto.Proyecto.domain.Cita;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CitaDaoImpl implements CitaDao {
    private final JdbcTemplate jdbcTemplate;

    // Constructor para inyectar la dependencia JdbcTemplate
    public CitaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void guardarCita(Cita cita) {
        String sql = "INSERT INTO SolicitarCita (id, asunto, telefono, especialista, fecha_hora, comentario) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, cita.getId(), cita.getAsunto(), cita.getTelefono(),
                cita.getEspecialista(), cita.getFecha_hora(), cita.getComentario());
    }

    // Implementar aquí otros métodos de consulta o actualización de la base de datos
}

