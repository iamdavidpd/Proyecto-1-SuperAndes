package uniandes.edu.co.proyecto.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RecepcionProductos")
public class RecepcionProductos {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Date fechaRecepcion;

    @OneToOne
    @JoinColumn(name = "id_Bodega", referencedColumnName = "Id_Bodega")
    private Bodega id_Bodega;

    @OneToOne
    @JoinColumn(name = "id_OrdenCompra", referencedColumnName = "Id_OrdenCompra")
    private OrdenCompra id_OrdenCompra;

    public RecepcionProductos(Long id, Date fechaRecepcion, Bodega id_Bodega, OrdenCompra id_OrdenCompra) {
        this.id = id;
        this.fechaRecepcion = fechaRecepcion;
        this.id_Bodega = id_Bodega;
        this.id_OrdenCompra = id_OrdenCompra;
    }
    

    public RecepcionProductos() { ;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Bodega getId_Bodega() {
        return id_Bodega;
    }

    public void setId_Bodega(Bodega id_Bodega) {
        this.id_Bodega = id_Bodega;
    }

    public OrdenCompra getId_OrdenCompra() {
        return id_OrdenCompra;
    }

    public void setId_OrdenCompra(OrdenCompra id_OrdenCompra) {
        this.id_OrdenCompra = id_OrdenCompra;
    }
}
