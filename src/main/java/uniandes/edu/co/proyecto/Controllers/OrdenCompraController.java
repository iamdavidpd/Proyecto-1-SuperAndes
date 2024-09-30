package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.OrdenCompra;
import uniandes.edu.co.proyecto.Repositories.OrdenCompraRepository;

@RestController
public class OrdenCompraController {
    
    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    @GetMapping("/OrdenesCompra")
    public Collection<OrdenCompra> getAllOrdenesCompra() {
        return ordenCompraRepository.getAllOrdenCompras();
    }
}
