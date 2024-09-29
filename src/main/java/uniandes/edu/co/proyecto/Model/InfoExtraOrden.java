package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraOrden")
public class InfoExtraOrden {
    private Integer cantidad;

    private Double costoUnitarioCompra;

    public InfoExtraOrden(Integer cantidad, Double costoUnitarioCompra) {
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

}
