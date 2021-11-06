package com.RestaurantServices.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="mesas")
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "numero",length = 30)
	private String numero;
	
	public Mesa() {
		
	}
	public Mesa(String codigo) {
		super();
		this.numero = codigo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return numero;
	}
	public void setCodigo(String codigo) {
		this.numero = codigo;
	}
	
}
 