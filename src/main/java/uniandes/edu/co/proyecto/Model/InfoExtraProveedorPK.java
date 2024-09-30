package uniandes.edu.co.proyecto.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Embeddable
public class InfoExtraProveedorPK implements Serializable{
    
    @ManyToMany
    @JoinColumn(name = "nit", referencedColumnName = "Nit_Proveedor")
    private Proveedor nit;

    @ManyToMany
    @JoinColumn(name = "codBar", referencedColumnName = "CodigoBarras_Producto")
    private Producto codBar;

    public InfoExtraProveedorPK(Proveedor nit, Producto codBar) {
        this.nit = nit;
        this.codBar = codBar;
    }

    public Proveedor getNit() {
        return nit;
    }

    public void setNit(Proveedor nit) {
        this.nit = nit;
    }

    public Producto getCodBar() {
        return codBar;
    }

    public void setCodBar(Producto codBar) {
        this.codBar = codBar;
    }

}
