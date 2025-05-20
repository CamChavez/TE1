package mx.unam.aragon.ico.te.universomvc.servicios;

import mx.unam.aragon.ico.te.universomvc.modelos.Planeta;
import mx.unam.aragon.ico.te.universomvc.repositorios.planetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaService {
    @Autowired
    private planetaRepository planetaRepository;

    public boolean guardarPlaneta(Planeta planeta) {
        Planeta result = planetaRepository.save(planeta);
        return result != null;
    }

    public List<Planeta> obtenerTodos() {
        return planetaRepository.findAll();
    }

    public void eliminarPorId(Integer id) {
        planetaRepository.deleteById(id);
    }
}