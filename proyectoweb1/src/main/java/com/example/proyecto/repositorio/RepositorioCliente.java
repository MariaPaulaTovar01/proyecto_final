package com.example.proyecto.repositorio;

import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface RepositorioCliente extends JpaRepository< Cliente , Integer >{

 @Query(value = "select distinct reserva.puesto_asignado, viaje.precio\r\n"
 		+ "from proyecto.reserva, proyecto.viaje\r\n"
 		+ "where cc_cliente = :cedula ", nativeQuery=true)
 public List<Object>Reservar(@Param("cedula")Integer cedula);
 
}

