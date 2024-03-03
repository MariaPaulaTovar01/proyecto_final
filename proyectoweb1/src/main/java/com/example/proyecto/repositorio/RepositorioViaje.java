package com.example.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.Viaje;


@Repository
public interface RepositorioViaje extends JpaRepository< Viaje, Integer> {

	public List<Viaje> findByDestino(String destino);

	 @Query(value = "Select v.destino, v.fecha, v.hora, b.matricula, v.precio "
	 		+ "from proyecto.viaje "
	 		+ "inner join proyecto.bus b "
	 		+ "on v.id_bus = b.matriculan"
	 		+ "group by v.destino;", nativeQuery = true )
			public List<Object>BuscarViaje();
	 
}
