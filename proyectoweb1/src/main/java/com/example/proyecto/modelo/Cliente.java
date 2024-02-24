package com.example.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "clientes")
public class Cliente {
	@Id
	@Column(name = "identificacion")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name ="apellidos")
	private String apellidos;
	
	@Column(name = "telefono")
	private long telefono;
	
	@Column (name = "fecha_nacimiento")
	private Date fecha_nac;
	
	public Cliente() {
		
	}
	

	public Cliente(long id, String nombre, String apellidos, long telefono, Date fecha_nac) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public Date getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

}
