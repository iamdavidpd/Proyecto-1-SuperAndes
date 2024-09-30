package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Bodega;
import uniandes.edu.co.proyecto.Repositories.BodegaRepository;

@RestController
public class BodegaController {
    
    @Autowired
    private BodegaRepository bodegaRepository;

    @GetMapping("/Bodegas")
    public Collection<Bodega> getAllBodegas() {
        return bodegaRepository.getBodegas();
    }
}
