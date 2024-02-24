package com.example.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "reservas")
public class reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_viaje;

	public reserva() {

	}
	
	
	
	
}
