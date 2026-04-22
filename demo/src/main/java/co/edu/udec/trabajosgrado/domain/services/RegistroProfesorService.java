package co.edu.udec.trabajosgrado.domain.services;

import java.util.ArrayList;
import java.util.List;

import co.edu.udec.trabajosgrado.domain.model.Profesor;

public class RegistroProfesorService {
    private List<Profesor> profesores = new ArrayList<>();

    public String registrarProfesor(Profesor nuevoProfesor) {
        // Validación: No permitir cédulas duplicadas
        for (Profesor p : profesores) {
            if (p.getCedula().equals(nuevoProfesor.getCedula())) {
                return "Error: El profesor con cédula " + nuevoProfesor.getCedula() + " ya existe.";
            }
        }
        
        profesores.add(nuevoProfesor);
        return "Éxito: Profesor " + nuevoProfesor.getNombreCompleto() + " registrado correctamente.";
    }

    public List<Profesor> listarProfesores() {
        return profesores;
    }
}
