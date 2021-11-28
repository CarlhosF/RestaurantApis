package com.RestaurantServices.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RestaurantServices.app.entity.Empleado;
import com.RestaurantServices.app.entity.Menu;
import com.RestaurantServices.app.entity.Usuario;
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	@Query(value = "select * from empleado e where e.usuario = :id", nativeQuery = true)
	Empleado getUsuario(@Param("id") long id);
}