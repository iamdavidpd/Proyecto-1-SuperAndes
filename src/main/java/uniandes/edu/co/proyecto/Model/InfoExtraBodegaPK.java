package uniandes.edu.co.proyecto.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Embeddable
public class InfoExtraBodegaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "codBarras", referencedColumnName = "CodigoBarras_Producto")
    private Producto codBarras;

    @OneToOne
    @JoinColumn(name = "idDetalleBodega", referencedColumnName = "Id_bodega")
    private DetalleCostoBodega idDetalleBodega;

    private Integer totalExistencia;
    private Double costoPromedio;
    private Double capacidadAlmacenamiento;
    private Double nivelMinimoReorden;

    public InfoExtraBodegaPK(Producto codBarras, DetalleCostoBodega idDetalleBodega, Integer totalExistencia, Double costoPromedio,
            Double capacidadAlmacenamiento, Double nivelMinimoReorden) {
        this.codBarras = codBarras;
        this.idDetalleBodega = idDetalleBodega;
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

    public Producto getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Producto codBarras) {
        this.codBarras = codBarras;
    }

    public DetalleCostoBodega getIdBodega() {
        return idDetalleBodega;
    }

    public void setIdBodega(DetalleCostoBodega idBodega) {
        this.idDetalleBodega = idBodega;
    }

}
