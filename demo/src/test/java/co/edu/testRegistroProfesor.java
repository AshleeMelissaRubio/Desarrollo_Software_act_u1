package co.edu;
import co.edu.udec.trabajosgrado.domain.model.*; //estudiantes, profesores, trabajos
import co.edu.udec.trabajosgrado.domain.services.*; //estudiantes, profesores, trabajos

public class testRegistroProfesor {
    public static void main(String[] args) {
        // Inicialización de servicios
        RegistroEstudianteService servicioEst = new RegistroEstudianteService();
        RegistroProfesorService servicioProf = new RegistroProfesorService();
        RegistroTrabajoService servicioTfc = new RegistroTrabajoService();

        System.out.println("=== DEMOSTRACIÓN FINAL DEL SPRINT: GESTIÓN T.F.C. ===\n");

        // 1. Registro de Estudiante
        Estudiante est = new Estudiante("7502420029", "112233", "Ashlee Melissa Rubio Zapa");
        System.out.println("[Estudiante]: " + servicioEst.registrarEstudiante(est));

        // 2. Registro de Profesor
        Profesor prof = new Profesor("456789", "Jhon Carlos Arrieta", "Sede Piedra Bolívar");
        System.out.println("[Profesor]: " + servicioProf.registrarProfesor(prof));

        // 3. Registro de Trabajo de Grado (Vinculado al estudiante)
        TrabajoGrado tfc = new TrabajoGrado("TFC-2026", "Desarrollo de Software Ágil", est);
        System.out.println("[Trabajo]: " + servicioTfc.registrarTrabajo(tfc));

        // 4. Resumen Final para la Sustentación
        System.out.println("\n--- Resumen del Incremento del Producto ---");
        System.out.println("Estudiante: " + est.getNombreCompleto());
        System.out.println("Docente a cargo: " + prof.getNombreCompleto());
        System.out.println("Proyecto: " + tfc.getTema());
    }
}
