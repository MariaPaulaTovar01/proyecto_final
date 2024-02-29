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
	@Autowired 
	private RepositorioReserva repositorio_R;
	@Autowired 
	private RepositorioViaje repositorio_V;
	
		/*CASO DE USO 1: REALIZAR-RESERVA-USUARIO*/
	
	@GetMapping("/BuscarDestino")
	public List<Viaje>BuscarViaje(){
		return this.repositorio_V.findByDestino("Ciudad B");
	} //listo

	@GetMapping("/GuardarInfoCliente")
	public void GuardarCliente(){
		LocalDate fecha_n = LocalDate.of(2003,12,9);
		Cliente c = new Cliente (101010100, "Mario", "Perez", 3102230456L , fecha_n );
		repositorioCliente.save(c);
		} //listo
	
	@GetMapping("GuardarReserva")
	public List<Object> GuardarReserva(){
		Cliente cliente;
		try {
			cliente = this.repositorioCliente.findById(333).get();
		}catch(Exception error){return null;}
		
		Viaje v = this.repositorio_V.findById(1).get();
		LocalDate fecha_reserva = LocalDate.now();
		
		reserva r = new reserva(cliente, v, 1, false, fecha_reserva);
		this.repositorio_R.save(r);
		return repositorio_R.MostrarReserva(333);
	}
	
	@GetMapping("/MostrarReserva")
	public List<Object> Mostrar_la_Reserva(Integer cedula){
		return this.repositorio_R.MostrarReserva(cedula);
	}
	
	/*FIN CASO DE USO 1*/
	
	/*CASO DE USO #2*/
	
	@GetMapping("/ConsultarReserva")
	public List<Object>Consultar(){
		return this.repositorio_R.ConsultarReserva(456789123);
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

