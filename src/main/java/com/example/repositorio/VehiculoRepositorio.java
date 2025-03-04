package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio {

	interface VehiculoRepository extends JpaRepository<vehiculo, Long> {}

}
