package com.deg.estudianteservice.service;

import com.deg.estudianteservice.exception.EstudianteExistente;
import com.deg.estudianteservice.model.Estudiante;
import com.deg.estudianteservice.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service 
public class EstudianteService {

    @Autowired // spring por medio de esta notacion "inyecta" lo que necesitamos
    private EstudianteRepository repository;


    public List<Estudiante> findAll(){
        return this.repository.findAll();
    }


    public Estudiante findById(Long id){
        Optional<Estudiante> estudiante = this.repository.findById(id);
        if(estudiante.isPresent()){
            Estudiante e = estudiante.get(); 
            return e;
        }
        return null;
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }

    public Estudiante crear(Estudiante nuevoEstudiante) throws EstudianteExistente {

        // Si existe no lo creamos. Con el findbydni buscamos si existe o no. Consultamos a la bdd
        Optional<Estudiante> e = this.repository.findByDni(nuevoEstudiante.getDni());

        if(e.isPresent()){
            throw new EstudianteExistente("El estudiante ya existe en la base de datos");
        }

        // No existe en la bdd, entonces lo creamos
        return this.repository.save(nuevoEstudiante);

    }

    public Estudiante actualizar(String dni, Estudiante estudianteActualizado) throws Exception {
        Optional<Estudiante> e = this.repository.findByDni(estudianteActualizado.getDni());

        if(e.isPresent()){
            // traemos al estudiante consultado. Si lo encuentra entonces lo traemos con el e.get
            Estudiante estudiante = e.get();
            estudiante.setNombre(estudianteActualizado.getNombre());
            estudiante.setApellido(estudianteActualizado.getApellido());
            return this.repository.save(estudiante);
        } else {
            throw new Exception("El estudiante no existe en la base de datos");
        }
    }
}
