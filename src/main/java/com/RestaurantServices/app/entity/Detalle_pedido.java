package com.RestaurantServices.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "detalles_pedidos")
public class Detalle_pedido implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "IDPEDIDO",nullable = false,referencedColumnName = "id")
	private Pedido pedido;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu", referencedColumnName = "id", nullable = false)
	private Menu menu;
	
	@Column(name = "cantidad", nullable = false)
	private long cantidad;

	public Detalle_pedido() {
		super();
	}

	
	public Detalle_pedido(Pedido idpedido, Menu menu, long cantidad) {
		super();
		pedido = idpedido;
		this.menu = menu;
		this.cantidad = cantidad;
	}


	public Pedido getIdpedido() {
		return pedido;
	}


	public void setIdpedido(Pedido idpedido) {
		pedido = idpedido;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
