package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.RecepcionProductos;
import uniandes.edu.co.proyecto.Repositories.RecepcionProductosRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RecepcionProductosController {
    
    @Autowired
    private RecepcionProductosRepository recepcionProductosRepository;

    @GetMapping("/RecepcionProductos")
    public Collection<RecepcionProductos> getAllRecepcionProductos() {
        return recepcionProductosRepository.getAllRecepcionProductos();
    }
    
}
