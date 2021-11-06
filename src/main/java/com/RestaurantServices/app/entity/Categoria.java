package com.RestaurantServices.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="categorias")
public class Categoria implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "Categoria")
	private String Categoria;
	
	
	
	
	public Categoria() {
		super();
	}



	public Categoria(String categoria) {
		super();
		Categoria = categoria;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getCategoria() {
		return Categoria;
	}



	public void setCategoria(String categoria) {
		Categoria = categoria;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
