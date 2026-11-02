package clubfutbol;

/**
 * CLASE HIJA / SUBCLASE: JugadorCampo
 * 
 * La palabra clave 'extends' establece la relación de HERENCIA.
 * 'JugadorCampo' hereda automáticamente todos los atributos y métodos 
 * públicos y protegidos de 'miembroEquipo'.
 */
public class JugadorCampo extends miembroEquipo {
    
    // ATRIBUTOS ESPECÍFICOS DE LA SUBCLASE
    // Además de lo que hereda del padre (ligaOrigen, salarioMensual, etc.),
    // el JugadorCampo posee características propias que no todos los miembros del equipo tienen.
    private String posicionTactica;
    private int golesMarcados;
    
    // CONSTRUCTOR DE LA SUBCLASE
    public JugadorCampo(String ligaOrigen, int goles){
                
        // La instrucción 'super(ligaOrigen)' invoca explícitamente al constructor de la clase padre (miembroEquipo).
        // Es OBLIGATORIO que 'super()' sea la primera línea dentro del constructor de una subclase
        // para inicializar adecuadamente la parte del objeto que corresponde a la superclase.
        super (ligaOrigen);        
        this.golesMarcados = goles;
        
    } // Fin de constructor

    // METODOS GETTER Y SETTER PROPIOS DE ESTA CLASE
    public String getPosicionTactica() {
        return posicionTactica;
    } // Fin de getPosicionTactica

    // Asigna la posición táctica con una validación simple utilizando isBlank()
    public void setPosicionTactica(String posicionTactica) {
        
        if (posicionTactica.isBlank()){
            
            this.posicionTactica = "Sin posicion";
            
        } else {
            
            this.posicionTactica = posicionTactica;
            
        }
        
    } // Fin de setPosicionTactica
    
    // COMPORTAMIENTO ESPECÍFICO DE JUGADOR DE CAMPO
    // Este método demuestra el uso de métodos y atributos heredados de la clase padre.
    public void disputarPartido(){
        
        int goles = 0;
        
        System.out.println("Seleccionado oficial!!!");
        System.out.println("--------------------");
        
        // USO DE HERENCIA: 'iniciarPretemporada()' no está declarado en JugadorCampo,
        // pero se puede ejecutar porque se heredó de la clase padre 'miembroEquipo'.
        iniciarPretemporada();
        
        // USO DE HERENCIA: 'this.ligaOrigen' se heredó directamente de 'miembroEquipo' 
        // gracias a que fue definido como 'protected' en la superclase.
        System.out.printf("Jugador proveniente de: %s, sale a la cancha", this.ligaOrigen);
        
        // Bucle para simular la anotación de goles según los goles marcados
        while (goles < this.golesMarcados){
            
            if(goles % 2 == 0){
                
                // NOTA: El marcador %d no está en la cadena de formato, por lo que 'goles + 1' no se imprimirá en el %s/%d.
                System.out.printf("Gol par anotado de pierna izquierda\n", goles + 1);
                
            } else {
                
                System.out.printf("Gol impar anotado de pierna derecha\n", goles + 1);
                
            } // Fin de IF
            goles++;
        } // Fin de ciclo while
        
        System.out.println("PIIIIII...... FIN DEL PARTIDOOOOO");
        
        // USO DE HERENCIA: Invoca al método protegido 'setsumarMinutos()' heredado del padre.
        setsumarMinutos(90);
        
    } // Fin metodo disputarPartido
    
} // Fin de Class JugadorCampo