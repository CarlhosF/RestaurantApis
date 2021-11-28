package com.RestaurantServices.app.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RestaurantServices.app.Repository.PedidoRepository;import com.RestaurantServices.app.Repository.detalles_pedidosRepository;
import com.RestaurantServices.app.entity.Detalle_pedido;
import com.RestaurantServices.app.entity.Pedido;

@Service
public class PedidoService{
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	//@Override
	@Transactional(readOnly = true)
	public Iterable<Pedido> findAll(){
		return pedidoRepository.findAll();
	}
	//@Override
	public Page<Pedido> findAll(Pageable pageable){
		return pedidoRepository.findAll(pageable);
	}
	//@Override
	public Optional<Pedido> findById(long id){
		return pedidoRepository.findById(id);
	}
	//@Override
	@Transactional(readOnly = false)
	public Pedido Save(Pedido pedido) {
		
		
		Pedido pedidoAux=new Pedido();
		pedidoAux.setEmpleado(pedido.getEmpleado());
		pedidoAux.setEstado(pedido.getEstado());
		pedidoAux.setFecha_pedido(pedido.getFecha_pedido());
		pedidoAux.setMesa(pedido.getMesa());
		pedidoAux.setObservacion(pedido.getObservacion());
		pedidoAux.setCliente(pedido.getCliente());
		List<Detalle_pedido> detalles=pedido.getDetalle_pedido();
		for (Detalle_pedido item : detalles) {
			item.setIdpedido(pedidoAux);
		}
		pedidoAux.setDetalle_pedido(detalles);
		
		return pedidoRepository.save(pedidoAux);
					
		
	}
	//@Override
	public void deleteById(long id) {
		pedidoRepository.deleteById(id);
	}
}

