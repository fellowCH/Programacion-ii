package clubfutbol;

public class JugadorCampo extends miembroEquipo{
    
    private String posicionTactica;
    private int golesMarcados;
    
    // Constuctor de JugadorCampo
    public JugadorCampo(String ligaOrigen, int goles){
               
        super (ligaOrigen);        
        this.golesMarcados = goles;
        
    } // Fin de constructor

    
    // Getter
    public String getPosicionTactica() {
        return posicionTactica;
    } // Fin de getPosicionTactica

    // Setter
    public void setPosicionTactica(String posicionTactica) {
        
        if (posicionTactica.isBlank()){
            
            this.posicionTactica = "Sin posicion";
            
        } else {
            
            this.posicionTactica = posicionTactica;
            
        }
        
    } // Fin de setPosicionTactica
    
    public void disputarPartido(){
        
        int goles = 0;
        
        System.out.println("Seleccionado oficial!!!");
        System.out.println("--------------------");
        
        iniciarPretemporada();
        System.out.printf("Jugador proveniente de: %s, sale a la cancha", this.ligaOrigen);
        
        while (goles < this.golesMarcados){
            
            if(goles % 2 == 0){
                
                System.out.printf("Gol par anotado de pierna izquierda\n", goles + 1);
                
            } else {
                
                System.out.printf("Gol impar anotado de pierna derecha\n", goles + 1);
                
            } // Fin de IF
            goles++;
        } // Fin de ciclo while
        
        System.out.println("PIIIIII...... FIN DEL PARTIDOOOOO");
        
        setsumarMinutos(90);
        
    } // Fin metodo disputarPartido
    
} // Fin de Class JugadorCampo
