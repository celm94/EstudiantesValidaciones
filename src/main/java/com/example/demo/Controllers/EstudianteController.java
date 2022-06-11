package com.example.demo.Controllers;

import com.example.demo.Entities.Estudiante;
import com.example.demo.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> ListarEstudiantes(){
        return estudianteService.findAllListar();
    }

    @GetMapping(value = "/{id}")
    public Estudiante findById(@PathVariable Long id) {
        return estudianteService.findStudentById(id);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearProducto(@Valid @RequestBody Estudiante estudiante) {
        estudianteService.CreateStudent(estudiante);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void modificarEstudiante (@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudianteService.ModifyStudent(id, estudiante);
    }

    @GetMapping(value = "/{nombre}")
    public Estudiante findByName(@PathVariable String nombre) {
        return estudianteService.findStudentByName(nombre);
    }

    @DeleteMapping(value = "/{id}")
    public void EliminarEstudiante(@PathVariable Long id) {
        estudianteService.DeleteStudent(id);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex){

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {

            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }
}
