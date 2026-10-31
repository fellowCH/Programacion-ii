package clubfutbol;


public class miembroEquipo {
 
    protected String ligaOrigen;
    
    // Atributos
    private double salarioMensual;
    private boolean altaMedica;
    private double minutosJugados;
    
    
    // Constructor
    public miembroEquipo(String liga){
        
        this.ligaOrigen = liga;
        this.salarioMensual = 1000;
        this.altaMedica = false;
        this.minutosJugados = 0;
        
    }

    public void setSalarioMensual(double salario) {
        
        if (salario <= 0) {
            
            System.out.println("Ingrese un dato mayor a 0!!!");
            System.out.println("CONTRATO INVALIDOOOOOOOOOOOOOGOOOLL");
            salario = 0;
            
        } else{
            
            System.out.println("Salario ingresado correctamente.");
            this.salarioMensual = salarioMensual;
            
        } // Fin de IF
        
    } // Fin de SETTER setSalarioMensual
    
    public void iniciarPretemporada(){
        
        this.altaMedica = true; // 
        realizarPruebasFisicas();
        System.out.println("Se dio el alta medica...");
        
    } // Fin de iniciarPretemporada
    
    private void realizarPruebasFisicas(){
        
        System.out.println("Realizando las pruebas fisicas");
        String[] fases = new String [] {"Resistencia Fisica", "Fuerza", "Velocidad"};
        
        for (int i = 0; i < 10; i++) {
            
            System.out.printf("Aprobando la fase %d: %s\n", i + 1, fases[i]);
            
        } // Fin de for
               
    } // Fin de realizarPruebasFisicas
    
    protected void setsumarMinutos(int cantidad){
        
        if (cantidad > 0){
            
            System.out.println("Sumando minutos al jugador");
            this.minutosJugados += cantidad;
            
        }
        
    } // fin de setsumarMinutos
    
    
} // Fin de CLASS
