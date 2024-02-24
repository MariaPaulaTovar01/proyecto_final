package com.example.proyecto.repositorio;

import org.springframework.stereotype.Repository;
import com.example.proyecto.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioCliente extends JpaRepository< Cliente , Long >{

}
