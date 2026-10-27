package sistemaestudiante;

public class SistemaEstudiante {

    public static void main(String[] args) {
        
        Estudiante yo = new Estudiante();
        Estudiante xd = new Estudiante(15, 1.9);
        
        System.out.println("--- DATOS INICIALES ---");
        yo.mostrarDatos();
        System.out.println("------------------------");
        xd.mostrarDatos();
        System.out.println("------------------------");
        
        // Modificación de atributos
        xd.nombre = "Daniel";
        yo.nombre = "Oscar";
        
        xd.setEdad(20);
        yo.setEdad(30);
        
        System.out.println("\n--- DATOS ACTUALIZADOS ---");
        yo.mostrarDatos();
        System.out.println("------------------------");
        xd.mostrarDatos();
        System.out.println("------------------------");
        
    } // Fin de Main
    
} // Fin de Class