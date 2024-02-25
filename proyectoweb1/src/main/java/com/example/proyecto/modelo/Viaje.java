package com.example.proyecto.modelo;

import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@Column (name = "precio")
	private long precio;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "numero_bus", referencedColumnName="numero_bus")
	private Bus bus;

	public Viaje() {
		
	}

	public Viaje(Long id_viaje, String destino, Date fecha, LocalTime hora, int puestos, long precio, Bus bus) {
		this.id_viaje = id_viaje;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.puestos = puestos;
		this.precio = precio;
		this.bus = bus;
	}

	public Long getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(Long id_viaje) {
		this.id_viaje = id_viaje;
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

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	

}