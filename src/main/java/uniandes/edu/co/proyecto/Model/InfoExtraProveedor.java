package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraProveedor")
public class InfoExtraProveedor {
    
    @EmbeddedId
    private InfoExtraProveedorPK pk;

    public InfoExtraProveedor(Proveedor nit, Producto codBar) {
        this.pk = new InfoExtraProveedorPK(nit, codBar);
    }

    public InfoExtraProveedor() { ;
    }

    public InfoExtraProveedorPK getPk() {
        return pk;
    }

    public void setPk(InfoExtraProveedorPK pk) {
        this.pk = pk;
    }
}
