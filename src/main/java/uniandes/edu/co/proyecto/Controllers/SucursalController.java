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

import uniandes.edu.co.proyecto.Model.Sucursal;
import uniandes.edu.co.proyecto.Repositories.SucursalRepository;

@RestController
public class SucursalController {
    
    @Autowired
    private SucursalRepository sucursalRepository;

    @GetMapping("/Sucursales")
    public Collection<Sucursal> getAllSucursales() {
        return sucursalRepository.getAllSucursales();
    }

    @PostMapping("/Sucursales/new/save")
    public ResponseEntity<String> SucursalGuardar(@RequestBody Sucursal sucursal) {
        try {
            sucursalRepository.insertSucursal(sucursal.getNombre(), sucursal.getTamanio(), sucursal.getDireccion(),
                                        sucursal.getTelefono(), sucursal.getCodigo_Ciudad().getCodigo());
        
        return new ResponseEntity<>("Sucursal creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el Sucursal", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Sucursales/{id}/delete")
    public ResponseEntity<String> sucursalEliminar(@PathVariable("id") long id) {
        try {
            sucursalRepository.deleteSucursal(id);
            return new ResponseEntity<>("Sucursal eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el Sucursal", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/Sucursales/{id}/edit/save")
    public ResponseEntity<String> SucursalesEditarGuardar(@PathVariable("id") long id, @RequestBody Sucursal sucursal) {
        try {
            sucursalRepository.updateSucursal(id, sucursal.getNombre(), sucursal.getTamanio(), sucursal.getDireccion(),
                                            sucursal.getTelefono(), sucursal.getCodigo_Ciudad().getCodigo());
            return new ResponseEntity<>("sucursal actualizado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el sucursal", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
