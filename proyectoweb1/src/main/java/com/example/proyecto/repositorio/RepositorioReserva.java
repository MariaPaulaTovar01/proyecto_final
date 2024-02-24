package com.example.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.reserva;

@Repository
public interface RepositorioReserva extends JpaRepository < reserva, Long > {

}
