package com.example.proyecto.controladores;


import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Cliente;
import com.example.proyecto.repositorio.RepositorioCliente;
import com.example.proyecto.repositorio.RepositorioReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ver/client/")
public class ControladorCliente {
	
	@Autowired
	private RepositorioCliente repositorioCliente;
	@Autowired RepositorioReserva repositorio_R;

	@GetMapping("/saveinfo")
	public  void  guardar_Cliente(){
		LocalDate fechaActual =  LocalDate.now();
		LocalDate fecha_n = LocalDate.of(2003,12,9);
		Cliente c = new Cliente (101010100L, "Mario", "Perez", 3102230456L , fecha_n ,fechaActual );
		this.repositorioCliente.save(c);
		}
	
	@GetMapping("/see")
	public List<Cliente>mostrar_clientes(){
		return this.repositorioCliente.findAll();
	}
	
	@GetMapping("/searchbus")
	public List<Object>Busca_Bus(){
		return this.repositorioCliente.Busca_Bus();
	}
	
	@GetMapping("/cancel")
	public String Cancelar_Reserva() {
		this.repositorio_R.deleteById(1L);
		return "Reserva Cancelada con Exito";
	}
	}

