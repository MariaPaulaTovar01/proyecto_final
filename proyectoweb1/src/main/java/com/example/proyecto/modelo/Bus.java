package com.example.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "buses")
public class Bus {

	@Id
	@Column(name = "numero_bus")
	private long numero_bus;
	
	@Column (name = "numero_puestos")
	private int numero_puestos;

	public Bus() {
		
	}

	public Bus(long numero_bus, int numero_puestos) {
		this.numero_bus = numero_bus;
		this.numero_puestos = numero_puestos;
	}

	public long getNumero_bus() {
		return numero_bus;
	}

	public void setNumero_bus(long numero_bus) {
		this.numero_bus = numero_bus;
	}

	public int getNumero_puestos() {
		return numero_puestos;
	}

	public void setNumero_puestos(int numero_puestos) {
		this.numero_puestos = numero_puestos;
	}
	
}
