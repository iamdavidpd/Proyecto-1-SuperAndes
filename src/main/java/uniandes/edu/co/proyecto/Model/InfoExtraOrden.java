package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraOrden")
public class InfoExtraOrden {
    
    @EmbeddedId
    private InfoExtraOrdenPK pk;

    public InfoExtraOrden(Producto codigoBarras, OrdenCompra ordenCompra, Integer cantidad,
    Double costoUnitarioCompra){
        this.pk = new InfoExtraOrdenPK(codigoBarras, ordenCompra, cantidad, costoUnitarioCompra);
    }

    public InfoExtraOrden() { ;
    }

}
