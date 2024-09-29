package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DetalleCostosBodega")
public class DetalleCostosBodega {
    
    private Double costoUnitarioBodega;

    private Integer cantidadExistencias;

    public DetalleCostosBodega(Double costoUnitarioBodega, Integer cantidadExistencias) {
        this.costoUnitarioBodega = costoUnitarioBodega;
        this.cantidadExistencias = cantidadExistencias;
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

}
