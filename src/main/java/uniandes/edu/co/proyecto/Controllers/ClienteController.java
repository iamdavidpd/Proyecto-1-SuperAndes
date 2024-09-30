package uniandes.edu.co.proyecto.Controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.Model.Cliente;
import uniandes.edu.co.proyecto.Repositories.ClienteRepository;

@RestController
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/Clientes")
    public Collection<Cliente> getAllClientes() {
        return clienteRepository.getClientes();
    }
}
