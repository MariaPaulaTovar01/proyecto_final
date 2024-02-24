package com.example.proyecto.modelo;

import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "viajes")
public class Viaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_viaje;
	
	@Column(name = "destino")
	private String destino;
	
	@Column(name = "fecha_viaje")
	private Date fecha;
	
	@Column( name ="hora_viaje" )
	private LocalTime hora;
	
	@Column (name = "puestos_disponibles")
	private int puestos;

	public Viaje() {
		
	}

	public Viaje( String destino, Date fecha, LocalTime hora, int puestos) {
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.puestos = puestos;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	
	
	
	
	

}
