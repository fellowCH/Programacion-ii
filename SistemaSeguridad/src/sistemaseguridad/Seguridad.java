package sistemaseguridad;


public class Seguridad {
    
    // Atributos
    private int pinMaestro;
    private boolean puertaAbierta;
    private boolean modoLockdown;
    private int bateriaRespaldo;
    
    // Constructor
    public Seguridad(int pinInicial){
        
       this.pinMaestro = pinInicial;
       this.puertaAbierta = false;
       this.modoLockdown = false;
       this.bateriaRespaldo = 100;
        
    } // Fin de Constructor

    public void setPinMaestro(int pinActual, int pinNuevo) {
        
        if (pinActual == this.pinMaestro){
            
            if(pinActual >= 1000 && pinNuevo <= 9999){
                
                this.pinMaestro = pinMaestro;
                System.out.println("PIN Actualizado correctamente...");
                
            } else {
                
                System.out.println("Pin fuera de rango!");
                
            } // Fin de segundo IF
            
        } else {
            
            System.out.println("Pin Actual es incorrecto");
            
        } // Fin de primer IF
         
        
    } // Fin de setPinMaestro
    
    public boolean validarPin(int pinIntento){
        boolean resultado;
        
        if(this.pinMaestro == pinIntento){
            
            resultado = true;
            
        } else{
            
            resultado = false;
            
        }
        
        return resultado;
    } // Fin de Getter PinMaestro Validado
    
    public void activarLockdown(){
        
        this.modoLockdown = true;
        this.puertaAbierta = false;
        System.out.println("Lockdown activado... modo encierro");
        
    } // Fin Funcion SET Lockdown
    
    public void desactivarLockdown(){
        
        this.modoLockdown = false;
        System.out.println("Lock down desactivado... modo normal en operacion");
        
    } // 

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    } // Fin de get isPuertaAbierta

    public boolean isModoLockdown() {
        return modoLockdown;
    } // Fin de get isModoLockdown

    public int getBateriaRespaldo() {
        return bateriaRespaldo;
    } // Fin de get getBateriaRespaldo

    public void setPuertaAbierta(boolean modoPuerta) {
        this.puertaAbierta = modoPuerta;
    } // Fin de setPuertaAbierta

    public void setBateriaRespaldo(int bateria) {
        
        if (bateria < 0){
            
            this.bateriaRespaldo = 0;
            
        } else if (bateria > 100) {
            
            this.bateriaRespaldo = 100;
            
        } else {
            
            this.bateriaRespaldo = bateria;
            
        } // Fin de IF
        
    } // Fin de setBateriaRespaldo
    
    
    
    
} // Fin de Class Seguridad
