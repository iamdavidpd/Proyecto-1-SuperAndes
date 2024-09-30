package uniandes.edu.co.proyecto.Model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoBarras;

    private String nombre;
    private Double precioUnitarioVenta;
    private String presentacion;
    private Integer cantidadPresentacion;
    private String unidadMedida;
    private Date fechaExpiracion;

    @ManyToOne
    @JoinColumn(name = "codigo_categoria", referencedColumnName = "Codigo_Categoria")
    private Categoria codigo_categoria;

    @ManyToOne
    @JoinColumn(name = "id_especificacionEmpacado", referencedColumnName = "Id_especificacionEmpacado")
    private EspecificacionEmpacado id_especificacionEmpacado;

    public Producto(String nombre, Double precioUnitarioVenta, String presentacion,
            Integer cantidadPresentacion, String unidadMedida, Date fechaExpiracion, Categoria categoria,
            EspecificacionEmpacado especificacionEmpacado) {
        this.nombre = nombre;
        this.precioUnitarioVenta = precioUnitarioVenta;
        this.presentacion = presentacion;
        this.cantidadPresentacion = cantidadPresentacion;
        this.unidadMedida = unidadMedida;
        this.fechaExpiracion = fechaExpiracion;
        this.codigo_categoria = categoria;
        this.id_especificacionEmpacado = especificacionEmpacado;
    }

    public Producto() {;
    }
    
    public Long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(Double precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(Integer cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Categoria getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(Categoria categoria) {
        this.codigo_categoria = categoria;
    }

    public EspecificacionEmpacado getId_EspecificacionEmpacado() {
        return id_especificacionEmpacado;
    }

    public void setId_EspecificacionEmpacado(EspecificacionEmpacado especificacionEmpacado) {
        this.id_especificacionEmpacado = especificacionEmpacado;
    }
}
