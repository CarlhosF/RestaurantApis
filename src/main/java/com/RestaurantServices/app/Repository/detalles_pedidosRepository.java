package com.RestaurantServices.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestaurantServices.app.entity.Pedido;

@Repository
public interface detalles_pedidosRepository extends JpaRepository<Pedido, Long>{

}
