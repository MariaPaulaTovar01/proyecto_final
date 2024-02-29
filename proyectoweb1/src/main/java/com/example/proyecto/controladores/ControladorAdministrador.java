package com.example.proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import com.example.proyecto.repositorio.RepositorioAdministador;
import com.example.proyecto.repositorio.RepositorioReserva;
import com.example.proyecto.modelo.*;

@RestController
@RequestMapping("/adm")
public class ControladorAdministrador {
	
	@Autowired
	private RepositorioAdministador repositorioAdm;
	@Autowired
	private RepositorioReserva repositorioReserva;


	
	@GetMapping("/mostraradm")
	public List<Administrador> verAdm(){
		return repositorioAdm.findAll();
	}
	
	@GetMapping("/inicioSesion")
	public boolean iniciarSesion() {
		AtomicBoolean permiso = new AtomicBoolean(false);
		List<Administrador> verificar = repositorioAdm.findAll();
		verificar.forEach(elemento ->{
			if(elemento.getUsuario().equals("david") || elemento.getContrasena().equals("asdfghjkl")) 
			{
				permiso.set(true);;
			}
		});
		return permiso.get();
	}
	

	@GetMapping("/BuscarPorBus")
	public List<Object> MostrarPorBus(){
		String bus= "BUS001";
		return repositorioReserva.Mostrar_Por_Bus(bus);
	}

	@GetMapping("/listarDia")
	public List<Object>ListarDia(){
		LocalDate fecha_busqueda = LocalDate.now();
		return this.repositorioReserva.ListarDia(fecha_busqueda);
	}

}
