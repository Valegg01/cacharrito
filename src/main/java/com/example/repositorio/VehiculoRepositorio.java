package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.vehiculo;

public interface VehiculoRepositorio {

	interface VehiculoRepository extends JpaRepository<vehiculo, Long> {}

}
