import com.unicartagena.models.Estudiante;
import com.unicartagena.models.TrabajoGrado;
import com.unicartagena.services.RegistroTrabajoService;

public class testRegistroTrabajo {
    public static void main(String[] args) {
        RegistroTrabajoService servicioTrabajos = new RegistroTrabajoService();

        System.out.println("=== SIMULACIÓN SPRINT: REGISTRO DE TRABAJOS DE GRADO ===");

        // Creamos un estudiante para la prueba
        Estudiante est1 = new Estudiante("7502420029", "1045236", "Ashlee Melissa Rubio Zapa");

        // 1. Registro exitoso
        TrabajoGrado trabajo1 = new TrabajoGrado("TFC-001", "Optimización de Algoritmos", est1);
        System.out.println("Paso 1: " + servicioTrabajos.registrarTrabajo(trabajo1));

        // 2. Intento de registrar otro trabajo al mismo estudiante (Error de lógica de negocio)
        TrabajoGrado trabajo2 = new TrabajoGrado("TFC-002", "Inteligencia Artificial", est1);
        System.out.println("Paso 2: " + servicioTrabajos.registrarTrabajo(trabajo2));

        // 3. Resumen
        System.out.println("\nResumen de Trabajos:");
        for (TrabajoGrado t : servicioTrabajos.obtenerTodosLosTrabajos()) {
            System.out.println("Orden: " + t.getNumeroOrden() + 
                               " | Tema: " + t.getTema() + 
                               " | Alumno: " + t.getEstudiante().getNombreCompleto());
        }
    }
}
