package com.example.proyecto.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "reservas")
public class reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_viaje;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_cliente", referencedColumnName="identificacion")
	private Cliente clientes;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "viaje", referencedColumnName="id_viaje")
	private Viaje viaje;

	public reserva() {
	}

	public reserva( Cliente clientes, Viaje viaje) {
		this.clientes = clientes;
		this.viaje = viaje;

	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	
	
}
