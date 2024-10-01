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

import uniandes.edu.co.proyecto.Model.Producto;
import uniandes.edu.co.proyecto.Repositories.ProductoRepository;

@RestController
public class ProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/Productos")
    public Collection<Producto> getAllProductos() {
        return productoRepository.getAllProductos();
    }

    @PostMapping("/Productos/new/save")
    public ResponseEntity<String> ProductoGuardar(@RequestBody Producto producto) {
        try {
            productoRepository.insertProducto(producto.getNombre(), producto.getPrecioUnitarioVenta(), producto.getPresentacion(),
                                        producto.getCantidadPresentacion(), producto.getUnidadMedida(), producto.getFechaExpiracion(),
                                        producto.getCodigo_categoria().getCodigo(), producto.getId_EspecificacionEmpacado().getId());
        
        return new ResponseEntity<>("Producto creado exitosamente", HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al crear el Producto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Productos/{id}/delete")
    public ResponseEntity<String> productoEliminar(@PathVariable("id") long id) {
        try {
            productoRepository.deleteProducto(id);
            return new ResponseEntity<>("producto eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el producto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/Productos/{id}/edit/save")
    public ResponseEntity<String> ProductoEditarGuardar(@PathVariable("id") long id, @RequestBody Producto producto) {
        try {
            productoRepository.updateProducto(id, producto.getNombre(), producto.getPrecioUnitarioVenta(), producto.getPresentacion(),
                                            producto.getCantidadPresentacion(), producto.getUnidadMedida(), producto.getFechaExpiracion(),
                                            producto.getCodigo_categoria().getCodigo(), producto.getId_EspecificacionEmpacado().getId());
            return new ResponseEntity<>("Producto actualizado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el Producto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
