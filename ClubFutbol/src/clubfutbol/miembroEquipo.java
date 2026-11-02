package clubfutbol;

/**
 * CLASE PADRE / SUPERCLASE: miembroEquipo
 * 
 * ¿Qué es la herencia aquí?
 * Esta clase define los atributos y comportamientos generales que cualquier 
 * miembro del club de fútbol (jugadores, entrenadores, preparadores) va a poseer.
 * Sirve como la plantilla base sobre la cual se construirán clases más específicas.
 */
public class miembroEquipo {
 
    // Atributo con modificador "protected":
    // Significa que esta variable PUEDE ser accedida directamente por las clases hijas (subclases)
    // como 'JugadorCampo', así como por cualquier otra clase dentro del mismo paquete ('clubfutbol').
    protected String ligaOrigen;
    
    // Atributos con modificador "private":
    // Solamente la propia clase 'miembroEquipo' puede modificarlos o leerlos directamente.
    // Las clases hijas NO los heredan de forma directa; deben interactuar con ellos 
    // a través de métodos públicos o protegidos (getters y setters).
    private double salarioMensual;
    private boolean altaMedica;
    private double minutosJugados;
    
    // CONSTRUCTOR DE LA SUPERCLASE
    // Se ejecuta al crear un objeto de tipo miembroEquipo.
    // Inicializa la liga de origen recibida y le asigna valores por defecto a los demás atributos.
    public miembroEquipo(String liga){
        
        this.ligaOrigen = liga;
        this.salarioMensual = 1000;
        this.altaMedica = false;
        this.minutosJugados = 0;
        
    }

    // MÉTODO SETTER
    // Permite modificar el salario mensual aplicando una validación previa.
    // Este método es heredado por 'JugadorCampo', por lo que una instancia de JugadorCampo
    // puede llamar a este método para cambiar su salario.
    public void setSalarioMensual(double salario) {
        
        if (salario <= 0) {
            
            System.out.println("Ingrese un dato mayor a 0!!!");
            System.out.println("CONTRATO INVALIDOOOOOOOOOOOOOGOOOLL");
            salario = 0;
            
        } else {
            
            System.out.println("Salario ingresado correctamente.");
            // NOTA: 'salarioMensual' se está asignando a sí mismo en lugar del parámetro 'salario'.
            // Para asignar el nuevo valor debería ser: this.salarioMensual = salario;
            this.salarioMensual = salarioMensual;
            
        } // Fin de IF
        
    } // Fin de SETTER setSalarioMensual
    
    // MÉTODO PÚBLICO
    // Método que activa el estado de alta médica y desencadena la realización de pruebas físicas.
    // Es heredado y puede ser llamado desde clases hijas o externas.
    public void iniciarPretemporada(){
        
        this.altaMedica = true; 
        realizarPruebasFisicas();
        System.out.println("Se dio el alta medica...");
        
    } // Fin de iniciarPretemporada
    
    // MÉTODO PRIVADO
    // Al ser "private", este método pertenece EXCLUSIVAMENTE a miembroEquipo.
    // La clase hija 'JugadorCampo' NO puede llamarlo directamente, pero se ejecuta
    // de forma indirecta cuando 'JugadorCampo' llama a 'iniciarPretemporada()'.
    private void realizarPruebasFisicas(){
        
        System.out.println("Realizando las pruebas fisicas");
        String[] fases = new String [] {"Resistencia Fisica", "Fuerza", "Velocidad"};
        
        // NOTA DE EJECUCIÓN: El arreglo 'fases' tiene 3 elementos (índices 0, 1, 2).
        // Si el ciclo for corre hasta i < 10, lanzará un error (ArrayIndexOutOfBoundsException) al llegar a i = 3.
        for (int i = 0; i < 10; i++) {
            
            System.out.printf("Aprobando la fase %d: %s\n", i + 1, fases[i]);
            
        } // Fin de for
                
    } // Fin de realizarPruebasFisicas
    
    // MÉTODO PROTEGIDO (protected)
    // Este método permite sumar minutos a la cuenta personal del jugador.
    // Al ser "protected", la subclase 'JugadorCampo' puede invocarlo internamente.
    protected void setsumarMinutos(int cantidad){
        
        if (cantidad > 0){
            
            System.out.println("Sumando minutos al jugador");
            this.minutosJugados += cantidad;
            
        }
        
    } // fin de setsumarMinutos
    
} // Fin de CLASS