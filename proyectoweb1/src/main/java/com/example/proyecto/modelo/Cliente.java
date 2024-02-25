package com.example.proyecto.modelo;

import java.time.LocalDate;

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
	private LocalDate fecha_nac;
	
	@Column (name = "fecha_reserva")
	private LocalDate fecha_r;
	
	public Cliente() {
		
	}
	

	public Cliente(long id, String nombre, String apellidos, long telefono, LocalDate fecha_nac, LocalDate fecha_r) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
		this.fecha_r = fecha_r;
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


	public LocalDate getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}


	public LocalDate getFecha_r() {
		return fecha_r;
	}


	public void setFecha_r(LocalDate fecha_r) {
		this.fecha_r = fecha_r;
	}
	

}
