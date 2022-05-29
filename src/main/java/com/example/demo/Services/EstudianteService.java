package com.example.demo.Services;

import com.example.demo.Entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAllListar();
    public List<Estudiante> findStudentById(Long id);
    public List<Estudiante> findStudentByName(String name);
    public void CreateStudent(Estudiante estudiante);
    public void ModifyStudent(Long id, Estudiante estudiante);
    public void DeleteStudent(Long id);
}
