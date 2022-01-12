package com.deg.estudianteservice.repository;

import com.deg.estudianteservice.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

    Optional<Estudiante> findByDni(String dni);



}
