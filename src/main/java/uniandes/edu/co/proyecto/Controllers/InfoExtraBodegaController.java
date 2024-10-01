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

import uniandes.edu.co.proyecto.Model.InfoExtraBodega;
import uniandes.edu.co.proyecto.Repositories.InfoExtraBodegaRepository;

@RestController
public class InfoExtraBodegaController {
    
    @Autowired
    private InfoExtraBodegaRepository infoExtraBodegaRepository;

    @GetMapping("/InfoExtraBodegas")
    public Collection<InfoExtraBodega> getAllInfoExtraBodegas() {
        return infoExtraBodegaRepository.getAllInfoExtraBodega();
    }

    @PostMapping("/InfoExtraBodegas/new/save")
    public ResponseEntity<String> infoExtraBodegaGuardar(@RequestBody InfoExtraBodega infoExtraBodega) {
        try {
        infoExtraBodegaRepository.insertInfoExtraBodega(infoExtraBodega.getPk().getCodBarras().getCodigoBarras(),
                            infoExtraBodega.getPk().getIdBodega().getId(), infoExtraBodega.getPk().getTotalExistencia(),
                            infoExtraBodega.getPk().getCostoPromedio(), infoExtraBodega.getPk().getCapacidadAlmacenamiento(),
                            infoExtraBodega.getPk().getNivelMinimoReorden(), infoExtraBodega.getPk().getCostoPromedio());
        
        return new ResponseEntity<>("InfoExtraBodega creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el InfoExtraBodega", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/InfoExtraBodegas/{id}/delete")
    public ResponseEntity<String> infoExtraBodegaEliminar(@PathVariable("codBar") Long codBar, @PathVariable("idBod") Long idBodega) {
        try {
            infoExtraBodegaRepository.deleteInfoExtraBodega(codBar, idBodega);
            return new ResponseEntity<>("InfoExtraBodega eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el InfoExtraBodega", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
