package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.dao.CitaDao;
import com.Proyecto.Proyecto.domain.Cita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CitaController {

    @Autowired
    private CitaDao citaDao;

    @GetMapping("/cita")
    public String mostrarCita(Model model) {
        List<Cita> asunto = citaDao.findAll();
        model.addAttribute("asunto", asunto);
        model.addAttribute("nuevoAsunto", new Cita());
        return "cita"; // La vista Thymeleaf que muestra la tabla y el formulario
    }

    @PostMapping("/cita/guardar")
    public String agregarAsunto(@ModelAttribute Cita nuevoAsunto) {
        citaDao.save(nuevoAsunto);
        return "redirect:/cita"; 
    }
}
