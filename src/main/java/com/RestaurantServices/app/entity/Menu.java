package com.RestaurantServices.app.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table (name="menus")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "codigo",length = 30)
	private String codigo;
	@Column(name = "categoria",length = 40)
	private String categoria;
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
	public Menu(String codigo, String categoria, String descripcion, String nombre, float precio, byte[] imagen) {
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
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
