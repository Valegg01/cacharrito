package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.alquiler;

public interface alquilerRepositorio {
	
	interface AlquilerRepository extends JpaRepository<alquiler, Long> {}

}
