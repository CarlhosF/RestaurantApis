package com.RestaurantServices.app.Services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.RestaurantServices.app.entity.Pedido;


@Component
public interface PedidoInterface {
	
	public Iterable<Pedido> findAll();
	public Page<Pedido> findAll(Pageable pegeable);
	public Optional<Pedido> findById(long id);
	public Pedido Save(Pedido pedido);
	public void deleteById(long id);
	
}
