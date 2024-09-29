package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EspecificacionEmpacado")
public class EspecificacionEmpacado {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Double volumen_CM3;
    private Double peso_Gr;


    public EspecificacionEmpacado(Double volumen_CM3, Double peso_Gr) {
        this.volumen_CM3 = volumen_CM3;
        this.peso_Gr = peso_Gr;
    }

    public Double getVolumen_CM3() {
        return volumen_CM3;
    }

    public void setVolumen_CM3(Double volumen_CM3) {
        this.volumen_CM3 = volumen_CM3;
    }

    public Double getPeso_Gr() {
        return peso_Gr;
    }

    public void setPeso_Gr(Double peso_Gr) {
        this.peso_Gr = peso_Gr;
    }

    public Long getId() {
        return id;
    }

}
