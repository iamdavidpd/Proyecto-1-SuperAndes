package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sucursal")
public class Sucursal {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nombre;
    private Double tamanio;
    private String direccion;
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "codigo_Ciudad", referencedColumnName = "codigo_Ciudad")
    private Ciudad codigo_Ciudad;

    public Sucursal( String nombre, Double tamanio, String direccion, Integer telefono,
            Ciudad codigo_Ciudad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo_Ciudad = codigo_Ciudad;
    }

    public Sucursal() { ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Ciudad getCodigo_Ciudad() {
        return codigo_Ciudad;
    }

    public void setCodigo_Ciudad(Ciudad codigo_Ciudad) {
        this.codigo_Ciudad = codigo_Ciudad;
    }
}
