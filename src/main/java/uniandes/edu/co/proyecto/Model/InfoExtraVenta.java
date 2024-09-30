package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraVenta")
public class InfoExtraVenta {
    
    @EmbeddedId
    private InfoExtraVentaPK pk;

    public InfoExtraVenta(Producto codigoBarras, Venta idVenta, Integer cantidad, Double precio){
        this.pk = new InfoExtraVentaPK(codigoBarras, idVenta, cantidad, precio);
    }

    public InfoExtraVenta() {;
    }

    public InfoExtraVentaPK getPk() {
        return pk;
    }

    public void setPk(InfoExtraVentaPK pk) {
        this.pk = pk;
    }
}
