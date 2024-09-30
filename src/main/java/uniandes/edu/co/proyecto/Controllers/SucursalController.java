package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Sucursal;
import uniandes.edu.co.proyecto.Repositories.SucursalRepository;

@RestController
public class SucursalController {
    
    @Autowired
    private SucursalRepository sucursalRepository;

    @GetMapping("/Sucursales")
    public Collection<Sucursal> getAllSucursales() {
        return sucursalRepository.getAllSucursales();
    }
}
