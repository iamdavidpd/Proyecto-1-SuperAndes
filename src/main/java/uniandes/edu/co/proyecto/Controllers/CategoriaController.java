package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Categoria;
import uniandes.edu.co.proyecto.Repositories.CategoriaRepository;

@RestController
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/Categorias")
    public Collection<Categoria> getAllCategorias() {
        return categoriaRepository.getCategorias();
    }
}
