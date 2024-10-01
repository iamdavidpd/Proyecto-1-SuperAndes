package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.RecepcionProductos;
import uniandes.edu.co.proyecto.Repositories.RecepcionProductosRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RecepcionProductosController {
    
    @Autowired
    private RecepcionProductosRepository recepcionProductosRepository;

    @GetMapping("/RecepcionProductos")
    public Collection<RecepcionProductos> getAllRecepcionProductos() {
        return recepcionProductosRepository.getAllRecepcionProductos();
    }
    
    @PostMapping("/RecepcionProductos/new/save")
    public ResponseEntity<String> RecepcionProductosGuardar(@RequestBody RecepcionProductos recepcionProductos) {
        try {
            recepcionProductosRepository.insertRecepcionProductos(recepcionProductos.getFechaRecepcion(), recepcionProductos.getId_Bodega().getId(),
                                                        recepcionProductos.getId_OrdenCompra().getId());
        
        return new ResponseEntity<>("RecepcionProductos creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el RecepcionProductos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/RecepcionProductos/{id}/delete")
    public ResponseEntity<String> recepcionProductosEliminar(@PathVariable("id") long id) {
        try {
            recepcionProductosRepository.deleteRecepcionProductos(id);
            return new ResponseEntity<>("RecepcionProductos eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el RecepcionProductos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/RecepcionProductos/{id}/edit/save")
    public ResponseEntity<String> RecepcionProductosEditarGuardar(@PathVariable("id") long id, @RequestBody RecepcionProductos recepcionProductos) {
        try {
            recepcionProductosRepository.updateRecepcionProductos(id, recepcionProductos.getFechaRecepcion(), recepcionProductos.getId_Bodega().getId(),
                                                recepcionProductos.getId_OrdenCompra().getId());
            return new ResponseEntity<>("RecepcionProductos actualizado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el RecepcionProductos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
