package com.example.proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Cliente;
import com.example.proyecto.modelo.reserva;
import com.example.proyecto.repositorio.RepositorioCliente;
import com.example.proyecto.repositorio.RepositorioReserva;
import com.example.proyecto.repositorio.RepositorioViaje;

@RestController
@RequestMapping("/ver/reserva/")

public class ControladorReserva {

	@Autowired
	private RepositorioReserva repositorioR;
	private RepositorioCliente repositorioC;
	private RepositorioViaje repositorioV;

	
	
	/*@GetMapping("/guarda_reserva")
	public String MostrarReserva() {
		Cliente c = this.repositorioC.findById(101010100L).get();
		Viaje v = this.repositorioV.findById(1L);
		reserva r = new reserva(c, v);
		this.repositorioR.save(r);
		return "Reserva Realizada con exito";
	}*/
}
	

	

