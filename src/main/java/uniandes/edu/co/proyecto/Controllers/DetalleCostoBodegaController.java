package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.DetalleCostoBodega;
import uniandes.edu.co.proyecto.Repositories.DetalleCostoBodegaRepository;

@RestController
public class DetalleCostoBodegaController {
    
    @Autowired
    private DetalleCostoBodegaRepository detalleCostoBodegaRepository;

    @GetMapping("/DetalleCostoBodega")
    public Collection<DetalleCostoBodega> getAllDetalleCostoBodega() {
        return detalleCostoBodegaRepository.getAllDetalleCostoBodega();
    }
}
