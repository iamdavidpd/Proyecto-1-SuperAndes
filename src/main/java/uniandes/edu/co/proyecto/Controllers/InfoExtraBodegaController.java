package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.InfoExtraBodega;
import uniandes.edu.co.proyecto.Repositories.InfoExtraBodegaRepository;

@RestController
public class InfoExtraBodegaController {
    
    @Autowired
    private InfoExtraBodegaRepository infoExtraBodegaRepository;

    @GetMapping("/InfoExtraBodegas")
    public Collection<InfoExtraBodega> getAllInfoExtraBodegas() {
        return infoExtraBodegaRepository.getAllInfoExtraBodega();
    }
}
