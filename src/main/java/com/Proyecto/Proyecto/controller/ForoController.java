package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.domain.Foro;
import com.Proyecto.Proyecto.service.ForoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/foro")
public class ForoController {

    private final ForoService foroService;

    @Autowired
    public ForoController(ForoService foroService) {
        this.foroService = foroService;
    }

    @GetMapping("/")
    public String mostrarForo(Model model) {
        model.addAttribute("comentarios", foroService.obtenerTodosLosComentarios());
        return "foro";
    }

    @PostMapping("?") //HAY QUE CREAR UNO, PERO ES UNA IDEA
    public String agregarComentario(@ModelAttribute Foro foro) {
        foroService.guardarComentario(foro);
        return "redirect:/foro/";
    }
}

