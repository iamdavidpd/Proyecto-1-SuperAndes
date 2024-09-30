package uniandes.edu.co.proyecto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor {

    @Id
    private Long NIT;

    private String nombre;
    private String direccion;
    private String nombreContacto;
    private Long telefonoContacto;

    public Proveedor(Long nIT, String nombre, String direccion, String nombreContacto, Long telefonoContacto) {
        this.NIT = nIT;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombreContacto = nombreContacto;
        this.telefonoContacto = telefonoContacto;
    }

    public Proveedor() {;
    }

    public Long getNIT() {
        return NIT;
    }

    public void setNIT(Long nIT) {
        NIT = nIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public Long getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(Long telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    

}
