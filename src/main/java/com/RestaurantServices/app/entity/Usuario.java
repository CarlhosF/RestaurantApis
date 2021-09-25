package com.RestaurantServices.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "rol")
	private String rol;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="empleado")
	private Empleado empleado;
	

	public Usuario() {
		super();
	}

	public Usuario(String username, String password, String rol, Empleado empleado) {
		super();
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.empleado = empleado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
