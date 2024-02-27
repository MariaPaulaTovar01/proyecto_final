package com.example.proyecto.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Bus;
import com.example.proyecto.modelo.Viaje;
import com.example.proyecto.repositorio.RepositorioBus;
import com.example.proyecto.repositorio.RepositorioViaje;



@RestController
@RequestMapping("/ver/viaje/")
public class ControladorViaje {
	
		@Autowired
		private RepositorioViaje repositorio_V;
		private RepositorioBus repositorio_B;

	/* PENDIENTE REVISAR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
		@GetMapping("/disponibilidad")
		public String reservarPuesto(long busId, int cantidadPuestos) {
	       
	        Optional<Bus> optionalBus = this.repositorio_B.findById(2234L);
	        
	        if (!optionalBus.isPresent()) {
	            return "El autobús especificado no existe";
	        }
	        
	        Bus bus = optionalBus.get();
	        boolean[] puestosDisponibles = new boolean [bus.getNumero_puestos()];
	        
	        
	        int puestosTotales = puestosDisponibles.length;
	        int puestosReservados = 0;
	        for (boolean disponible : puestosDisponibles) {
	            if (!disponible) {
	                puestosReservados++;
	            }
	        }
	        
	        if (cantidadPuestos > puestosTotales - puestosReservados) {
	            return "No hay suficientes puestos disponibles";
	        }
	        
	        
	        for (int i = 0; i < puestosDisponibles.length && cantidadPuestos > 0; i++) {
	            if (puestosDisponibles[i]) {
	                puestosDisponibles[i] = false;
	                cantidadPuestos--;
	            }
	        }
	        
	       
	        //bus.set(puestosDisponibles);
	        this.repositorio_B.save(bus);
	        
	        return "Puestos reservados exitosamente";
		}*/
	}
	

