package uniandes.edu.co.proyecto.Repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.Model.InfoExtraVenta;
import uniandes.edu.co.proyecto.Model.InfoExtraVentaPK;

public interface InfoExtraVentaRepository extends JpaRepository<InfoExtraVenta, InfoExtraVentaPK> {

}
