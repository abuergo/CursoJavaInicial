package com.deg.estudianteservice.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data // nos evitamos crear los getters y setters. Lombok nos provee todas estas funcionalidades de forma implicita
@Entity 
public class Estudiante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // asignamos el id como key
    private Long id; 
    private String nombre;
    private String apellido;
    private String dni;

}