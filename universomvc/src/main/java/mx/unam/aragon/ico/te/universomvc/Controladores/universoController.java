package mx.unam.aragon.ico.te.universomvc.Controladores;

import mx.unam.aragon.ico.te.universomvc.modelos.Planeta;
import mx.unam.aragon.ico.te.universomvc.servicios.PlanetaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/datos")
public class universoController {

    @Autowired
    private PlanetaService planetaService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/planeta")
    public String planeta(Model model) {
        // Planeta ejemplo fijo: Mercurio
        Planeta planeta1 = new Planeta(
                1,
                "Mercurio",
                "Sólido",
                "radio de 2,439.7 km",
                "https://humanidades.com/wp-content/uploads/2024/03/Mercurio-portada.jpg",
                "193860000000",
                0
        );

        model.addAttribute("planeta1", planeta1);
        model.addAttribute("planetas", planetaService.obtenerTodos());
        return "planeta";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("planeta", new Planeta());
        return "formPlaneta";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Planeta planeta) {
        LoggerFactory.getLogger(getClass()).info("Guardando planeta + " + planeta);
        planetaService.guardarPlaneta(planeta);
        return "redirect:/datos/planeta?exito";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        planetaService.eliminarPorId(id);
        return "redirect:/datos/planeta?eliminado";
    }
}