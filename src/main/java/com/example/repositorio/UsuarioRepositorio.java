package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.usuario;

public interface UsuarioRepositorio {

	interface VehiculoRepository extends JpaRepository<usuario, Long> {}

}
