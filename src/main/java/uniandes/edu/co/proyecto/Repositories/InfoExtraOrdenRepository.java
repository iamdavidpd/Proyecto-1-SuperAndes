package uniandes.edu.co.proyecto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.Model.InfoExtraOrdenPK;
import uniandes.edu.co.proyecto.Model.InfoExtraOrden;

public interface InfoExtraOrdenRepository extends JpaRepository<InfoExtraOrden, InfoExtraOrdenPK> {

}
