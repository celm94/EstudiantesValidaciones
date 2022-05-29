package com.example.demo.Services;

import com.example.demo.DAO.EstudianteDAO;
import com.example.demo.Entities.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAllListar() {
        return (List<Estudiante>) estudianteDAO.findAll();
    }
    @Override
    public List<Estudiante> findStudentById(Long id) {

        return (List<Estudiante>) estudianteDAO.findById(id).orElse(null);

    }

    @Override
    public List<Estudiante> findStudentByName(String name) {
        return null;
    }

    @Override
    public List<Estudiante> CreateStudent(Estudiante estudiante) {
        return null;
    }

    @Override
    public List<Estudiante> ModifyStudent(Long id, Estudiante estudiante) {
        return null;
    }

    @Override
    public List<Estudiante> DeleteStudent(Long id) {
        return null;
    }
}
