package com.Proyecto.Proyecto.dao;

import com.Proyecto.Proyecto.domain.Foro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForoDao extends JpaRepository<Foro, Integer> {
    // Puedes agregar métodos de consulta personalizados si es necesario
}
