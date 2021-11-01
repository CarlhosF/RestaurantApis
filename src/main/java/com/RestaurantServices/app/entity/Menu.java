package com.RestaurantServices.app.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="menus")
public class Menu implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "codigo",length = 30)
	private String codigo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="categoria", referencedColumnName = "id")
	private Categoria categoria;
	@Column(name = "descripcion",length = 60)
	private String descripcion;
	@Column(name = "nombre",length = 40)
	private String nombre;
	@Column(name = "precio")
	private float precio;
	@Lob
	@Column(name = "imagen",columnDefinition = "bigint")
	private byte[] imagen;
	
	
	public Menu() {
		super();
	}
	public Menu(String codigo, Categoria categoria, String descripcion, String nombre, float precio, byte[] imagen) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
	
	
	
}
