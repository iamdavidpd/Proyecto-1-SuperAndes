package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.InfoExtraVenta;
import uniandes.edu.co.proyecto.Repositories.InfoExtraVentaRepository;

@RestController
public class InfoExtraVentaController {
    
    @Autowired
    private InfoExtraVentaRepository infoExtraVentaRepository;

    @GetMapping("/InfoExtraVentas")
    public Collection<InfoExtraVenta> getAllInfoExtraVenta() {
        return infoExtraVentaRepository.getAllInfoExtraVenta();
    }
}
