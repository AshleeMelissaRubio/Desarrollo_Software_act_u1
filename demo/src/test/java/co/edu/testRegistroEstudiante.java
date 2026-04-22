package co.edu;
import co.edu.udec.trabajosgrado.domain.model.Estudiante;
import co.edu.udec.trabajosgrado.domain.services.RegistroEstudianteService;

public class testRegistroEstudiante {
    public static void main(String[] args) {
        RegistroEstudianteService service = new RegistroEstudianteService();

        System.out.println("=== SIMULACIÓN SPRINT 1: REGISTRO DE ESTUDIANTES ===");
        Estudiante est1 = new Estudiante("7502420029", "1045236", "Ashlee Melissa Rubio Zapa");
        System.out.println("Intento 1: " + service.registrarEstudiante(est1));

        Estudiante est2 = new Estudiante("7502420028", "999888", "Emerejildo perez");
        System.out.println("Intento 2: " + service.registrarEstudiante(est2));

        System.out.println("\nAlumnos en el sistema:");
        for (Estudiante e : service.listarEstudiantes()) {
            System.out.println("- ID: " + e.getId() + " | Nombre: " + e.getNombreCompleto());
        }
    }
    
}
