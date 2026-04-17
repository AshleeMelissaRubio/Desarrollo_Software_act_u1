package com.unicartagena.services;
import com.unicartagena.models.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class RegistroEstudianteService {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public String registrarEstudiante(Estudiante nuevoEstudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(nuevoEstudiante.getId())) {
                return "Error: El código (ID) " + nuevoEstudiante.getId() + " ya existe en el sistema.";
            }
        
    }
    estudiantes.add(nuevoEstudiante);
    return "Registro exitoso: El alumno " + nuevoEstudiante.getNombreCompleto() + " ha sido guardado.";
    
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

}


