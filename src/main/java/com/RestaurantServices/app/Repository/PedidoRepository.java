package com.RestaurantServices.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RestaurantServices.app.entity.Menu;
import com.RestaurantServices.app.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	@Query(value = "SELECT * FROM pedidos  a where a.estado= 'LISTO' ", nativeQuery = true)
	List<Pedido> Listos();
}
