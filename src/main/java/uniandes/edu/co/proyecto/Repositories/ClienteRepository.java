package uniandes.edu.co.proyecto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
