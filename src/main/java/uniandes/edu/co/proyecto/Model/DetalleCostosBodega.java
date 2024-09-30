package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DetalleCostosBodega")
public class DetalleCostosBodega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Double costoUnitarioBodega;
    private Integer cantidadExistencias;

    public DetalleCostosBodega(Double costoUnitarioBodega, Integer cantidadExistencias) {
        this.costoUnitarioBodega = costoUnitarioBodega;
        this.cantidadExistencias = cantidadExistencias;
    }

    public DetalleCostosBodega() {;
    }

    public Double getCostoUnitarioBodega() {
        return costoUnitarioBodega;
    }

    public void setCostoUnitarioBodega(Double costoUnitarioBodega) {
        this.costoUnitarioBodega = costoUnitarioBodega;
    }

    public Integer getCantidadExistencias() {
        return cantidadExistencias;
    }

    public void setCantidadExistencias(Integer cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
