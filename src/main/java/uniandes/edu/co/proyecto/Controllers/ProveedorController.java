package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Proveedor;
import uniandes.edu.co.proyecto.Repositories.ProveedorRepository;

@RestController
public class ProveedorController {
    
    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping("/Proveedores")
    public Collection<Proveedor> getAllProveedores() {
        return proveedorRepository.getAllProveedores();
    }
}
