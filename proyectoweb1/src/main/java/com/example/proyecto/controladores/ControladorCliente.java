package com.example.proyecto.controladores;


import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Cliente;
import com.example.proyecto.modelo.Viaje;
import com.example.proyecto.modelo.reserva;
import com.example.proyecto.repositorio.RepositorioCliente;
import com.example.proyecto.repositorio.RepositorioReserva;
import com.example.proyecto.repositorio.RepositorioViaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ver/cliente/")
public class ControladorCliente {
	
	@Autowired
	private RepositorioCliente repositorioCliente;
	@Autowired RepositorioReserva repositorio_R;
	@Autowired RepositorioViaje repositorio_V;
	
		/*CASO DE USO 1: REALIZAR-RESERVA-USUARIO*/
	
	@GetMapping("/buscardestino")
	public List<Viaje>BuscarViaje(){
		return this.repositorio_V.findByDestino("Ciudad B");
	}

	@GetMapping("/saveinfo")
	public void GuardarCliente(){
		LocalDate fecha_n = LocalDate.of(2003,12,9);
		Cliente c = new Cliente (101010100, "Mario", "Perez", 3102230456L , fecha_n );
		repositorioCliente.save(c);
		}
	
	@GetMapping("/reserva")
	public List<Object> Reservar(){
		return this.repositorioCliente.Reservar(123456789);
	}
	
	/*FIN CASO DE USO 1*/
	
	/*CASO DE USO #2*/
	
	@GetMapping("/consultar")
	public List<Object>Consultar(){
		return this.repositorio_R.ConsultarReserva(456789123);
	}
	
	/*FIN CASO DE USO #2*/
	
	/*CASO DE USO #3*/
	
	@GetMapping("/cancelar")
	public void Cancelar_Reserva() {
	}
	
	/* FIN CASO DE USO 3*/
}

