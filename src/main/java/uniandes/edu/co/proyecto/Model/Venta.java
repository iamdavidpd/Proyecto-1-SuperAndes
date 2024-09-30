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
@Table(name = "Venta")
public class Venta {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_Sucursal", referencedColumnName = "Id_Sucursal")
    private Sucursal id_Sucursal;

    @OneToOne
    @JoinColumn(name = "id_Cliente", referencedColumnName = "Id_Cliente")
    private Cliente id_Cliente;

    public Venta(Long id, Date fecha, Sucursal id_Sucursal, Cliente id_Cliente) {
        this.id = id;
        this.fecha = fecha;
        this.id_Sucursal = id_Sucursal;
        this.id_Cliente = id_Cliente;
    }

    public Venta() { ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sucursal getId_Sucursal() {
        return id_Sucursal;
    }

    public void setId_Sucursal(Sucursal id_Sucursal) {
        this.id_Sucursal = id_Sucursal;
    }

    public Cliente getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Cliente id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
}
