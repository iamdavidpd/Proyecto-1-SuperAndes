package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ciudad")
public class Ciudad {

    @Id
    private Long codigo;

    private String nombre;

    public Ciudad(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Ciudad() {;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
