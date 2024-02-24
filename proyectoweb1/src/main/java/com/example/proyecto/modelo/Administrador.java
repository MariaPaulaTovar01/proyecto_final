package com.example.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "administradores")
public class Administrador {

	@Id
	@Column(name = "cod_admin")
	private long id;
	
	@Column(name = "usuario")
	private String user;
	
	@Column(name = "password")
	private String password;

	public Administrador() {
		
	}

	public Administrador(long id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
