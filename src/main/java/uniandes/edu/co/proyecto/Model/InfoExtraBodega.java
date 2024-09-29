package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraBodega")
public class InfoExtraBodega {

    private Integer totalExistencia;

    private Double costoPromedio;

    private Double capacidadAlmacenamiento;

    private Double nivelMinimoReorden;

    public InfoExtraBodega(Integer totalExistencia, Double costoPromedio, Double capacidadAlmacenamiento,
            Double nivelMinimoReorden) {
        this.totalExistencia = totalExistencia;
        this.costoPromedio = costoPromedio;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.nivelMinimoReorden = nivelMinimoReorden;
    }

    public Integer getTotalExistencia() {
        return totalExistencia;
    }

    public void setTotalExistencia(Integer totalExistencia) {
        this.totalExistencia = totalExistencia;
    }

    public Double getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(Double costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public Double getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(Double capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public Double getNivelMinimoReorden() {
        return nivelMinimoReorden;
    }

    public void setNivelMinimoReorden(Double nivelMinimoReorden) {
        this.nivelMinimoReorden = nivelMinimoReorden;
    }

}
