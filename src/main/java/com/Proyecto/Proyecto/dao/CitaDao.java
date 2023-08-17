package com.Proyecto.Proyecto.dao;


import com.Proyecto.Proyecto.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CitaDao extends JpaRepository<Cita, Long> {
    // Puedes agregar métodos de consulta personalizados si es necesario
}

