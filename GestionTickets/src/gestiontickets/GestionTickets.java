package gestiontickets;

public class GestionTickets {

    public static void main(String[] args) {
        
        // 1. Instancia de la clase Padre (TareaBase)
        TareaBase tarea1 = new TareaBase("TB-01", "Prueba 1", false);
        tarea1.marcaResuelto();
        System.out.println("Prioridad: " + tarea1.calcularPrioridad());
        
        System.out.println("\n");
        System.out.println("SIGUE HIJO DE TAREA BASE");
        System.out.println("");
        
        // 2. Instancia de la clase Hija (Bugs)
        // Al heredar de TareaBase, 'Bugs' tiene acceso a los métodos como marcaResuelto()
        Bugs bugs1 = new Bugs("A-01", "Prueba 1A", false, "Produccion");
        bugs1.marcaResuelto(); 
        System.out.println("\nPrioridad: " + bugs1.calcularPrioridad()); // Usa el método sobreescrito en Bugs
        
        System.out.println("\n");
        System.out.println("SIGUE EL NIETO DE TAREA BASE:");
        System.out.println("SIGUE EL HIJO DE BUGS");
        System.out.println("");
        
        // 3. Instancia de la clase Nieta (BugSeguridad)
        // Hereda todo de Bugs, y por lo tanto, todo lo de TareaBase.
        BugSeguridad bs = new BugSeguridad("BS-02", "Prueba 2JS", false, "Produccion", "12FV", true);
        bs.marcaResuelto(); // Puede usar métodos del "abuelo" (TareaBase)
        System.out.println("\nPrioridad: " + bs.calcularPrioridad()); // Usa el método del "padre" (Bugs)
        
    } // Fin de Main
    
} // Fin de Class