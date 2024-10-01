package uniandes.edu.co.proyecto.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrdenCompra")
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Date fechaCreacion;
    private String estado;
    private Date fechaEntrega;

    @ManyToOne
    @JoinColumn(name = "Nit_proveedor", referencedColumnName = "Nit_proveedor")
    private Proveedor Nit_proveedor;

    @OneToOne
    @JoinColumn(name = "Id_Sucursal", referencedColumnName = "Id_Sucursal")
    private Sucursal Id_Sucursal;

    public OrdenCompra(Long id, Date fechaCreacion, String estado, Date fechaEntrega, Proveedor nit_proveedor,
            Sucursal id_Sucursal) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        Nit_proveedor = nit_proveedor;
        Id_Sucursal = id_Sucursal;
    }

    public OrdenCompra() {;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Proveedor getNit_proveedor() {
        return Nit_proveedor;
    }

    public void setNit_proveedor(Proveedor nit_proveedor) {
        Nit_proveedor = nit_proveedor;
    }

    public Sucursal getId_Sucursal() {
        return Id_Sucursal;
    }

    public void setId_Sucursal(Sucursal id_Sucursal) {
        Id_Sucursal = id_Sucursal;
    }
    
}
