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

import uniandes.edu.co.proyecto.Model.Proveedor;
import uniandes.edu.co.proyecto.Repositories.ProveedorRepository;

@RestController
public class ProveedorController {
    
    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping("/Proveedores")
    public Collection<Proveedor> getAllProveedores() {
        return proveedorRepository.getAllProveedores();
    }

    @PostMapping("/Proveedores/new/save")
    public ResponseEntity<String> ProveedoresGuardar(@RequestBody Proveedor proveedor) {
        try {
            proveedorRepository.insertProveedor(proveedor.getNIT(), proveedor.getNombre(),
                                        proveedor.getDireccion(), proveedor.getNombreContacto(),
                                        proveedor.getTelefonoContacto());
        
        return new ResponseEntity<>("proveedor creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el proveedor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Proveedores/{id}/delete")
    public ResponseEntity<String> proveedorEliminar(@PathVariable("id") long id) {
        try {
            proveedorRepository.deleteProveedor(id);
            return new ResponseEntity<>("proveedor eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el proveedor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
