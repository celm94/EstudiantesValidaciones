package com.example.demo.Services;

import com.example.demo.Entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAllListar();
    public List<Estudiante> findStudentById(Long id);
    public List<Estudiante> findStudentByName(String name);
    public List<Estudiante> CreateStudent(Estudiante estudiante);
    public List<Estudiante> ModifyStudent(Long id, Estudiante estudiante);
    public List<Estudiante> DeleteStudent(Long id);
}
