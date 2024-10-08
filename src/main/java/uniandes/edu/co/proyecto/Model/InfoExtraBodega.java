package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoExtraBodega")
public class InfoExtraBodega {
    
    @EmbeddedId
    private InfoExtraBodegaPK pk;

    public InfoExtraBodega(Producto codBarras, Bodega idBodega, DetalleCostoBodega idCostobodega, Integer totalExistencia, Double costoPromedio,
    Double capacidadAlmacenamiento, Double nivelMinimoReorden){
        this.pk = new InfoExtraBodegaPK(codBarras, idBodega, idCostobodega, totalExistencia, costoPromedio, capacidadAlmacenamiento, nivelMinimoReorden);
    }

    public InfoExtraBodega() {;
    }

    public InfoExtraBodegaPK getPk() {
        return pk;
    }

    public void setPk(InfoExtraBodegaPK pk) {
        this.pk = pk;
    }
}
