package com.Proyecto.Proyecto.controller;

import com.Proyecto.Proyecto.domain.Cita;
import com.Proyecto.Proyecto.service.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CitaController {
    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @RequestMapping("/solicitar-cita")
    public String mostrarFormularioCita() {
        return "cita"; // Reemplaza "cita" por el nombre de tu vista (plantilla HTML) para mostrar el formulario
    }

    @PostMapping("/guardar-cita")
    public String guardarCita(@RequestParam("name") String nombre,
                              @RequestParam("reason") String motivo,
                              @RequestParam("preferred-date") String fechaPreferencia,
                              // Agregar los demás parámetros del formulario
                              @RequestParam("phone") String telefono,
                              @RequestParam("specialist") String especialista,
                              // El campo de comentario es opcional, puedes agregarlo también si lo necesitas
                              @RequestParam(value = "comment", required = false) String comentario) {
        // Aquí puedes realizar validaciones adicionales antes de guardar la cita
        Cita cita = new Cita();
        cita.setId(1); // Reemplaza el valor 1 por el ID del usuario logueado, por ejemplo
        cita.setAsunto(motivo);
        cita.setTelefono(telefono);
        cita.setEspecialista(especialista);

        // Convertir la fecha preferida a un formato de fecha adecuado antes de asignarla a la cita
        // Por ejemplo, si la fecha llega en formato "dd-mm-yy", conviértela a un objeto de tipo "java.util.Date" o "java.time.LocalDate"
        // cita.setFechaPreferencia(convertirAFecha(fechaPreferencia));

        // Asignar los demás valores de la cita desde los parámetros
        // cita.set... // Completa aquí con los demás campos de la tabla SolicitarCita

        citaService.guardarCita(cita);

        return "redirect:/solicitar-cita"; // Redirigir a la página del formulario después de guardar la cita
    }

    // Agregar aquí otros métodos de control para gestionar citas médicas
}

