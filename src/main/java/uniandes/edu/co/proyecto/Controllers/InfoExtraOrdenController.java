package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
