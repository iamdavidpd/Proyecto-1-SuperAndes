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

import uniandes.edu.co.proyecto.Model.DetalleCostoBodega;
import uniandes.edu.co.proyecto.Repositories.DetalleCostoBodegaRepository;

@RestController
public class DetalleCostoBodegaController {
    
    @Autowired
    private DetalleCostoBodegaRepository detalleCostoBodegaRepository;

    @GetMapping("/DetalleCostoBodega")
    public Collection<DetalleCostoBodega> getAllDetalleCostoBodega() {
        return detalleCostoBodegaRepository.getAllDetalleCostoBodega();
    }

    @PostMapping("/DetalleCostoBodega/new/save")
    public ResponseEntity<String> DetalleCostoBodegaGuardar(@RequestBody DetalleCostoBodega detalleCostoBodega) {
        try {
            detalleCostoBodegaRepository.insertDetalleCostoBodega(detalleCostoBodega.getCostoUnitarioBodega(), detalleCostoBodega.getCantidadExistencias());
        
        return new ResponseEntity<>("DetalleCostoBodega creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el DetalleCostoBodega", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/DetalleCostoBodega/{id}/delete")
    public ResponseEntity<String> detalleCostoBodegaEliminar(@PathVariable("id") long id) {
        try {
            detalleCostoBodegaRepository.deleteDetalleCostoBodega(id);
            return new ResponseEntity<>("DetalleCostoBodega eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el DetalleCostoBodega", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
