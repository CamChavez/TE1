package mx.unam.aragon.ico.te.universomvc.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")  /*se le informa al handle cuando se solicite la raiz del proyecto, se mapee con el get, con el metodo obtenerInicial, que ne sete caso el metodo retorne el index, que es una vista, es decir que despues de manda del handle adapter se enviar al view resplver para la vista, para que este lo ecnuentre, se pone en la carpeta TEMPLATES*/
public class MainController {
    @GetMapping()
    public String index() {
    return "index";
    }
}
