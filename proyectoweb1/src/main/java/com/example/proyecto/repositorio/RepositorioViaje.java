package com.example.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.Viaje;


@Repository
public interface RepositorioViaje extends JpaRepository< Viaje, Long> {

}