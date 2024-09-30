package uniandes.edu.co.proyecto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.Model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
