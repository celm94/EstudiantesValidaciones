package com.example.demo.DAO;

import com.example.demo.Entities.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteDAO extends CrudRepository<Estudiante, Long>{
    public Estudiante findByName(String Name);

}
