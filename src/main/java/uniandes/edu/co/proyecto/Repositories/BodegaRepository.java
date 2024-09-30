package uniandes.edu.co.proyecto.Repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.Model.Bodega;
import uniandes.edu.co.proyecto.Model.Sucursal;

public interface BodegaRepository extends JpaRepository<Bodega, Long>{

    @Query(value = "SELECT * FROM Bodega", nativeQuery = true)
    Collection<Bodega> getBodegas();

    @Query(value = "SELECT * FROM Bodega WHERE Id = :id", nativeQuery = true)
    Bodega getBodega(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Bodega (Id, Nombre, Tamanio, Id_Sucursal) VALUES (proyecto-1-superandes_sequence.nextval, :nombre, :tamanio, :id_sucursal)", nativeQuery = true)
    void insertBodega(@Param("nombre") String nombre, @Param("tamanio") Double tamanio, @Param("id_sucursal") Sucursal id_Sucursal);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Bodega SET Nombre = :nombre, Tamanio = :tamanio, Id_Sucursal = :id_sucursal WHERE id = :id", nativeQuery = true)
    void updateBodega(@Param("id") long id, @Param("nombre") String nombre, @Param("tamanio") Double tamanio, @Param("id_sucursal") Sucursal id_Sucursal);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Bodega WHERE Id = :id", nativeQuery = true)
    void deleteBodega(@Param("id") long id);
}
