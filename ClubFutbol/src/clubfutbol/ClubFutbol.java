package clubfutbol;

/**
 * CLASE PRINCIPAL: ClubFutbol
 * 
 * Contiene el método main(), punto de entrada donde se instancian las clases
 * y se comprueba el funcionamiento práctico de la herencia.
 */
public class ClubFutbol {

    public static void main(String[] args) {
        
        // 1. Instanciación directa de la Superclase:
        // 'Fellow' es un miembro del equipo genérico de la "Liga Hondurennia".
        miembroEquipo Fellow = new miembroEquipo("Liga Hondurennia");
        
        // 2. Instanciación de la Subclase:
        // 'CH' es un objeto de la subclase JugadorCampo.
        // Recibe "2da Division" (que viajará mediante super() a la clase padre) y 2 goles.
        JugadorCampo CH = new JugadorCampo("2da Division", 2);
        
        // 3. Demostración de Herencia en uso:
        // 'CH' (JugadorCampo) llama a 'setSalarioMensual()', un método que NO está definido 
        // explícitamente en la clase JugadorCampo, sino en su clase padre 'miembroEquipo'.
        CH.setSalarioMensual(25.00);
        
        // 4. Llamada a un método propio de la subclase:
        // 'setPosicionTactica()' solo existe dentro de la clase JugadorCampo.
        CH.setPosicionTactica("La numero 10...");
        
    } // Fin de Main
    
} // Fin de Class