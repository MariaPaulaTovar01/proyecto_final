package com.example.proyecto.controladores;


import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Cliente;
import com.example.proyecto.modelo.Viaje;
import com.example.proyecto.modelo.reserva;
import com.example.proyecto.repositorio.RepositorioCliente;
import com.example.proyecto.repositorio.RepositorioReserva;
import com.example.proyecto.repositorio.RepositorioViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ver/cliente/")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class ControladorCliente {
	
	@Autowired
	private RepositorioCliente repositorioCliente;
	@Autowired 
	private RepositorioReserva repositorio_R;
	@Autowired 
	private RepositorioViaje repositorio_V;
	
		/*CASO DE USO 1: REALIZAR-RESERVA-USUARIO*/
	
	@PostMapping("/BuscarDestino")
	public List<Viaje>BuscarViaje(@RequestBody String destino ){
		return this.repositorio_V.findByDestino(destino);
	} //listo

	@PostMapping("/GuardarInfoCliente")
	public Cliente GuardarCliente(@RequestBody Cliente cliente ){

		return repositorioCliente.save(cliente);
		} //listo
	
	@PostMapping("/GuardarReserva")
	public List<Object> GuardarReserva(@RequestBody Integer cedula, Integer id_viaje){
		Cliente cliente;
		try {
			cliente = this.repositorioCliente.findById(cedula).get();
		}catch(Exception error){return null;}
		
		Viaje v = this.repositorio_V.findById(id_viaje).get();
		LocalDate fecha_reserva = LocalDate.now();
		
		reserva r = new reserva(cliente, v, 1, false, fecha_reserva);
		this.repositorio_R.save(r);
		return repositorio_R.MostrarReserva(cedula);
	}
	
	@GetMapping("/MostrarReserva")
	public List<Object> Mostrar_la_Reserva(Integer cedula){
		return this.repositorio_R.MostrarReserva(cedula);
	}
	
	/*FIN CASO DE USO 1*/
	
	/*CASO DE USO #2*/
	
	@PostMapping("/ConsultarReserva")
	public List<Object>Consultar(@RequestBody Integer cedula){
		return this.repositorio_R.ConsultarReserva(cedula);
	} //listo
	
	/*FIN CASO DE USO #2*/
	
	/*CASO DE USO #3*/
	
	@GetMapping("/cancelar")
	public String Cancelar_Reserva() {
		try {
		repositorio_R.EliminarReserva(17);
		repositorioCliente.EliminarCliente(333);
		return "Reserva cancelada";
		}catch(Exception error) {
			String e = error.toString(); 
			return e;
		}
	}
	
	/* FIN CASO DE USO 3*/
}

