package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Ciudad;
import uniandes.edu.co.proyecto.Repositories.CiudadRepository;

@RestController
public class CiudadController {
    
    @Autowired
    private CiudadRepository ciudadRepository;

    @GetMapping("/Ciudades")
    public Collection<Ciudad> getAllCiudades() {
        return ciudadRepository.getCiudades();
    }
}
