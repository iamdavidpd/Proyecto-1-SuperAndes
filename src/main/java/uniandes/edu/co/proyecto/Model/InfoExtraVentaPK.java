package uniandes.edu.co.proyecto.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Embeddable
public class InfoExtraVentaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "codigoBarras", referencedColumnName =  "CodigoBarras_Producto")
    private Producto codigoBarras;

    @OneToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "Id_Venta")
    private Venta id_venta;

    private Integer cantidad;
    private Double precioUnitarioVenta;

    public InfoExtraVentaPK(Producto codigoBarras, Venta id_venta, Integer cantidad, Double precioUnitarioVenta) {
        this.codigoBarras = codigoBarras;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(Double precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public Producto getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Producto codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Venta getId_venta() {
        return id_venta;
    }

    public void setId_venta(Venta id_venta) {
        this.id_venta = id_venta;
    }
}
