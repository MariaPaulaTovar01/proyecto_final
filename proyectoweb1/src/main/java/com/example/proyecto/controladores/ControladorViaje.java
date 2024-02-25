package com.example.proyecto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Viaje;
import com.example.proyecto.repositorio.RepositorioViaje;



@RestController
@RequestMapping("/ver/viaje/")
public class ControladorViaje {
	
		@Autowired
		private RepositorioViaje repositorio_V;
		
		
		@GetMapping("/buscardestino")
		public List<Viaje>Buscar_Por_Destino(){
			return this.repositorio_V.findByDestino("MEDELLIN");
		}
	}
	

