package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.InfoExtraOrden;
import uniandes.edu.co.proyecto.Repositories.InfoExtraOrdenRepository;

@RestController
public class InfoExtraOrdenController {
    
    @Autowired
    private InfoExtraOrdenRepository infoExtraOrdenRepository;

    @GetMapping("/InfoExtraOrdenes")
    public Collection<InfoExtraOrden> getAllInfoExtraOrdenes() {
        return infoExtraOrdenRepository.getAllInfoExtraOrden();
    }

    @PostMapping("/InfoExtraOrdenes/new/save")
    public ResponseEntity<String> infoExtraOrdenGuardar(@RequestBody InfoExtraOrden infoExtraOrden) {
        try {
        infoExtraOrdenRepository.insertInfoExtraOrden(infoExtraOrden.getPk().getCodigoBarras().getCodigoBarras(),
                                        infoExtraOrden.getPk().getOrdenCompra().getId(), infoExtraOrden.getPk().getCantidad(),
                                        infoExtraOrden.getPk().getCostoUnitarioCompra());
        
        return new ResponseEntity<>("InfoExtraOrden creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el InfoExtraOrden", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
