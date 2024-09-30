package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Venta;
import uniandes.edu.co.proyecto.Repositories.VentaRepository;

@RestController
public class VentaController {
    
    @Autowired
    private VentaRepository ventaRepository;

    @GetMapping("/Ventas")
    public Collection<Venta> getAllVentas() {
        return ventaRepository.getAllVentas();
    }
}
