package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/Categorias/new/save")
    public ResponseEntity<String> categoriaGuardar(@RequestBody Categoria categoria) {
        try {
            categoriaRepository.insertCategoria(categoria.getNombre(), categoria.getDescripcion(), categoria.getCaracteristicasAlmacenamiento());
        
        return new ResponseEntity<>("categoria creada exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear la categoria", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Categorias/{id}/delete")
    public ResponseEntity<String> categoriaEliminar(@PathVariable("id") long id) {
        try {
            categoriaRepository.deleteCategoria(id);
            return new ResponseEntity<>("Categoria eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el Categoria", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
