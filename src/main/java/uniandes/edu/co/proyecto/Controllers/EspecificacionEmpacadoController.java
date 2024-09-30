package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.EspecificacionEmpacado;
import uniandes.edu.co.proyecto.Repositories.EspecificacionEmpacadoRepository;

@RestController
public class EspecificacionEmpacadoController {
    
    @Autowired
    private EspecificacionEmpacadoRepository especificacionEmpacadoRepository;

    @GetMapping("/EspecificacionEmpacado")
    public Collection<EspecificacionEmpacado> getAllEspecificacionEmpacado() {
        return especificacionEmpacadoRepository.getAllEspecificacionEmpacado();
    }
}
