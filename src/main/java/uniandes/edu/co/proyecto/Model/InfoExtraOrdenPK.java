package uniandes.edu.co.proyecto.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Embeddable
public class InfoExtraOrdenPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "codigoBarras", referencedColumnName = "CodigoBarras_Producto")
    private Producto codigoBarras;

    @OneToOne
    @JoinColumn(name = "ordenCompra", referencedColumnName = "Id_OrdenCompra")
    private OrdenCompra ordenCompra;

    private Integer cantidad;
    private Double costoUnitarioCompra;

    public InfoExtraOrdenPK(Producto codigoBarras, OrdenCompra ordenCompra, Integer cantidad,
            Double costoUnitarioCompra) {
        this.codigoBarras = codigoBarras;
        this.ordenCompra = ordenCompra;
        this.cantidad = cantidad;
        this.costoUnitarioCompra = costoUnitarioCompra;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCostoUnitarioCompra() {
        return costoUnitarioCompra;
    }

    public void setCostoUnitarioCompra(Double costoUnitarioCompra) {
        this.costoUnitarioCompra = costoUnitarioCompra;
    }

    public Producto getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Producto codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
}
