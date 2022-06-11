package com.example.demo.Services;

import com.example.demo.DAO.EstudianteDAO;
import com.example.demo.Entities.Estudiante;
import com.example.demo.Exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAllListar() {
        return (List<Estudiante>) estudianteDAO.findAll();
    }
    @Override
    public Estudiante findStudentById(Long id) {
        Optional<Estudiante> student = estudianteDAO.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        else{
            throw new NotFoundException("El estudiante no existe");
        }
    }

    @Override
    public Estudiante findStudentByName(String name) {
        Optional<Estudiante> studentname = Optional.ofNullable(estudianteDAO.findByName(name));
        if(studentname.isPresent()){
            return studentname.get();
        }
        else{
            throw new NotFoundException("El estudiante no existe");
        }

    }

    @Override
    public void CreateStudent(Estudiante estudiante) {
        estudianteDAO.save(estudiante);
    }

    @Override
    public void ModifyStudent(Long id, Estudiante estudiante) {
        if (estudianteDAO.existsById(id)) {
            estudiante.setId(id);
            estudianteDAO.save(estudiante);
        }
        else{
            throw new NotFoundException("El estudiante no existe");
        }

    }

    @Override
    public void DeleteStudent(Long id) {
        if (estudianteDAO.existsById(id)) {
            estudianteDAO.deleteById(id);
        }
        else{
            throw new NotFoundException("El estudiante no existe");
        }

    }
}
