package uniandes.edu.co.proyecto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
