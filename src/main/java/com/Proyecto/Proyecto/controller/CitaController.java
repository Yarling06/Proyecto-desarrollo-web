import com.Proyecto.Proyecto.domain.Cita;
import com.Proyecto.Proyecto.service.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CitaController {
    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/solicitar-cita")
    public String mostrarFormularioCita(@ModelAttribute("cita") Cita cita) {
        return "cita"; // Reemplaza "cita" por el nombre de tu vista (plantilla HTML) para mostrar el formulario
    }

    @PostMapping("/guardar-cita")
    public String guardarCita(@ModelAttribute("cita") Cita cita) {
        citaService.guardarCita(cita);
        return "cita-confirmada"; // Reemplaza "cita-confirmada" por la vista que deseas mostrar después de guardar la cita
    }
}
