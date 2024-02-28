package com.example.proyecto.repositorio;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.reserva;

@Repository
public interface RepositorioReserva extends JpaRepository < reserva, Integer > {

	@Query(value="Select reserva.puesto_asignado, viaje.precio\r\n"
			+ "from proyecto.reserva \r\n"
			+ "join proyecto.viaje on reserva.id_viaje = viaje.id_viaje", nativeQuery = true)
	public List<Object> mostrarReserva();
	
	@Query(value = "Select viaje.destino,viaje.hora, viaje.precio, viaje.fecha "
			+ "from proyecto.viaje join proyecto.reserva "
			+ "on viaje.id_viaje = reserva.id_viaje and cc_cliente = :cedula", nativeQuery = true)
	public List <Object> ConsultarReserva(@Param("cedula") Integer cedula);
	
	@Query(value = "select viaje.fecha , cliente.nombre, cliente.apellido, reserva.fecha_de_reserva "
			+ "from proyecto.reserva "
			+ "inner join proyecto.viaje "
			+ "inner join proyecto.cliente "
			+ "on reserva.id_viaje = viaje.id_viaje and reserva.cc_cliente = cliente.cedula "
			+ "where reserva.fecha_de_reserva = :fecha_de_reserva", nativeQuery=true)
	public List<Object>ListarDia( @Param("fecha_de_reserva")LocalDate fecha_de_reserva);
	
	/*@Query()
	public void Cancelar_Reserva();*/
	
	
}
	