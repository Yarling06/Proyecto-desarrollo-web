package com.Proyecto.Proyecto.dao;


import com.Proyecto.Proyecto.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaDao extends JpaRepository<Cita, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}
