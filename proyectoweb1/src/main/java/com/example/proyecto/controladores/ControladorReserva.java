package com.example.proyecto.controladores;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Cliente;
import com.example.proyecto.modelo.reserva;
import com.example.proyecto.modelo.Viaje;
import com.example.proyecto.repositorio.RepositorioCliente;
import com.example.proyecto.repositorio.RepositorioReserva;
import com.example.proyecto.repositorio.RepositorioViaje;

@RestController
@RequestMapping("/ver/reserva/")

public class ControladorReserva {

	@Autowired private RepositorioReserva repositorioR;
	@Autowired private RepositorioCliente repositorioC;
	@Autowired private RepositorioViaje repositorioV;

	
	
	@GetMapping("/guarda_reserva")
	public List<Object> MostrarReserva() {
		Cliente cliente;
		try {
			cliente = this.repositorioC.findById(123456789).get();
		}catch(Exception error){return null;}
		
		Viaje v = this.repositorioV.findById(1).get();
		LocalDate fecha_reserva = LocalDate.now();
		reserva r = new reserva(cliente, v, 1, false, fecha_reserva);
		this.repositorioR.save(r);
		return repositorioR.mostrarReserva();
	}
}
	

	

