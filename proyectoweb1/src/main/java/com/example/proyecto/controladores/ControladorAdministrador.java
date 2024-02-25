package com.example.proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import com.example.proyecto.repositorio.RepositorioAdministador;
import com.example.proyecto.modelo.*;

@RestController
@RequestMapping("/adm")
public class ControladorAdministrador {
	
	@Autowired
	private RepositorioAdministador repositorioAdm;
	
	@GetMapping("/mostraradm")
	public List<Administrador> verAdm(){
		return repositorioAdm.findAll();
	}
	
	@GetMapping("/inicioSesion")
	public boolean iniciarSesion() {
		AtomicBoolean permiso = new AtomicBoolean(false);
		List<Administrador> verificar = repositorioAdm.findAll();
		verificar.forEach(elemento ->{
			if(elemento.getUser().equals("david") || elemento.getPassword().equals("asdfghjkl")) 
			{
				permiso.set(true);;
			}
		});
		return permiso.get();
	}
	

}
