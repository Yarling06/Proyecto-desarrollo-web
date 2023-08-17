package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.dao.ForoDao;
import com.Proyecto.Proyecto.domain.Foro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ForoController {

    @Autowired
    private ForoDao foroDao;

    @GetMapping("/foro")
    public String mostrarForo(Model model) {
        List<Foro> comentarios = foroDao.findAll();
        model.addAttribute("comentarios", comentarios);
        model.addAttribute("nuevoComentario", new Foro());
        return "foro"; // La vista Thymeleaf que muestra la tabla y el formulario
    }

    @PostMapping("/foro/agregar")
    public String agregarComentario(@ModelAttribute Foro nuevoComentario) {
        foroDao.save(nuevoComentario);
        return "redirect:/foro"; // Redirigir de nuevo a la página del foro
    }
}
