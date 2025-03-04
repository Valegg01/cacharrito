package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.alquiler;

public interface alquilerRepositorio {
	
	interface AlquilerRepository extends JpaRepository<alquiler, Long> {}

}
interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {}
interface UsuarioRepository extends JpaRepository<Usuario, Long> {}