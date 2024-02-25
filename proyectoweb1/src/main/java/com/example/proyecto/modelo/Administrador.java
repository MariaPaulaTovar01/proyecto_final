package com.example.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "administradores")
public class Administrador {

	@Id	
	@Column(name = "usuario")
	private String user;
	
	@Column(name = "contrasena")
	private String contrasena;

	public Administrador() {
		
	}

	public Administrador(String user, String password) {
		this.user = user;
		this.contrasena = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return contrasena;
	}

	public void setPassword(String password) {
		this.contrasena = password;
	}
	
	
	
	
	
}
