package uniandes.edu.co.proyecto.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductoPerecedero")
public class ProductoPerecedero extends Producto {

    private Date fechaVencimiento;

    public ProductoPerecedero(String nombre, Double precioUnitarioVenta, String presentacion,
    Integer cantidadPresentacion, String unidadMedida, Date fechaExpiracion, Categoria categoria,
    EspecificacionEmpacado especificacionEmpacado, Date fechaVencimiento) {
                super(nombre, precioUnitarioVenta, presentacion, cantidadPresentacion, 
                unidadMedida, fechaExpiracion, categoria, especificacionEmpacado);
                this.fechaVencimiento = fechaVencimiento;
            }
    
    public ProductoPerecedero(){;}

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
