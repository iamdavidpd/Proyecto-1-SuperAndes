package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.InfoExtraProveedor;
import uniandes.edu.co.proyecto.Repositories.InfoExtraProveedorRepository;

@RestController
public class InfoExtraProveedorController {
    
    @Autowired
    private InfoExtraProveedorRepository infoExtraProveedorRepository;

    @GetMapping("/InfoExtraProveedor")
    public Collection<InfoExtraProveedor> getAllInfoExtraProveedor() {
        return infoExtraProveedorRepository.getAllInfoExtraProveedors();
    }
}
