package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Producto;
import uniandes.edu.co.proyecto.Repositories.ProductoRepository;

@RestController
public class ProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/Productos")
    public Collection<Producto> getAllProductos() {
        return productoRepository.getAllProductos();
    }
}
