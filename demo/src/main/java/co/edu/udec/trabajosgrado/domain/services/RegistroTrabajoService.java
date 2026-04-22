package co.edu.udec.trabajosgrado.domain.services;

import java.util.ArrayList;
import java.util.List;

import co.edu.udec.trabajosgrado.domain.model.TrabajoGrado;

public class RegistroTrabajoService {
private List<TrabajoGrado> trabajos = new ArrayList<>();

    public String registrarTrabajo(TrabajoGrado nuevoTrabajo) {
        // Validar si el número de orden ya existe
        for (TrabajoGrado t : trabajos) {
            if (t.getNumeroOrden().equals(nuevoTrabajo.getNumeroOrden())) {
                return "Error: El número de orden " + nuevoTrabajo.getNumeroOrden() + " ya está registrado.";
            }
            
            // Validar que el estudiante no tenga ya un trabajo asignado
            if (t.getEstudiante().getId().equals(nuevoTrabajo.getEstudiante().getId())) {
                return "Error: El estudiante " + nuevoTrabajo.getEstudiante().getNombreCompleto() + " ya tiene un trabajo asignado.";
            }
        }

        trabajos.add(nuevoTrabajo);
        return "Éxito: Trabajo '" + nuevoTrabajo.getTema() + "' registrado correctamente.";
    }

    public List<TrabajoGrado> obtenerTodosLosTrabajos() {
        return trabajos;
    }


}
