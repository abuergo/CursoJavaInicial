package com.deg.estudianteservice.controller;

import com.deg.estudianteservice.exception.EstudianteExistente;
import com.deg.estudianteservice.model.Estudiante;
import com.deg.estudianteservice.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

// le decimos que vamos a crear endpoints
@RestController
@RequestMapping(path="/api/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping(path="/")
    public ResponseEntity<List<Estudiante>> getAll(){
        return new ResponseEntity<>(this.estudianteService.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Estudiante> crear(@RequestBody @Validated Estudiante nuevoEstudiante){
        try{
            return new ResponseEntity<>(this.estudianteService.crear(nuevoEstudiante), HttpStatus.OK);
        } catch(EstudianteExistente estudianteExistente){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, estudianteExistente.getMessage());
        }
    }

}
