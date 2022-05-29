package com.example.demo.Services;

import com.example.demo.Entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAll();
    public List<Estudiante> findById(Long id);
    public List<Estudiante> findByName(String name);
    public List<Estudiante> Create(Estudiante estudiante);
    public List<Estudiante> Modify(Long id, Estudiante estudiante);
    public List<Estudiante> Delete(Long id);
}
