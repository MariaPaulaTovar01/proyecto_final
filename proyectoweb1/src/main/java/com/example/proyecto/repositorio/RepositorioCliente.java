package com.example.proyecto.repositorio;

import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface RepositorioCliente extends JpaRepository< Cliente , Long >{

	@Query ( value = "Select v.destino, v.fecha_viaje, v.hora_viaje, b.numero_bus, v.precio " 
			+ "from proyecto.viajes v inner join proyecto.buses b on v.numero_bus = b.numero_bus "
			+ "group by v.destino", nativeQuery = true)
		public List<Object>Busca_Bus();
}
