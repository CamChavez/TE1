package mx.unam.aragon.ico.te.universomvc.Controladores;

import mx.unam.aragon.ico.te.universomvc.modelos.Planeta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datos")
public class universoController {

    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/planeta/")
    public String planeta(Model model) {
        Planeta planeta1 = new Planeta(1, "mercurio", "solido", "radio de 2,439.7km", "https://humanidades.com/wp-content/uploads/2024/03/Mercurio-portada.jpg", "193860000000", 0);
        model.addAttribute("planeta1", planeta1);
        return "planeta";
    }


}


