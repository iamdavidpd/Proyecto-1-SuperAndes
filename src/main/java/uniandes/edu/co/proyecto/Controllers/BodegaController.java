package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Bodega;
import uniandes.edu.co.proyecto.Repositories.BodegaRepository;

@RestController
public class BodegaController {
    
    @Autowired
    private BodegaRepository bodegaRepository;

    @GetMapping("/Bodegas")
    public Collection<Bodega> getAllBodegas() {
        return bodegaRepository.getBodegas();
    }

    @PostMapping("/Bodegas/new/save")
    public ResponseEntity<String> BodegaGuardar(@RequestBody Bodega bodega) {
        try {
            bodegaRepository.insertBodega(bodega.getNombre(), bodega.getTamanio(), bodega.getSucursal());
        
        return new ResponseEntity<>("Bodega creada exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear la bodega", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
