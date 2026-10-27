package gestiontickets;

// Esta es la "Superclase" o clase Padre. Contiene los atributos y métodos comunes.
public class TareaBase {
    
    // 'private' significa que solo esta clase puede ver estos atributos.
    // Las clases hijas no pueden acceder a ellos directamente, deben usar 'super()' en el constructor.
    private String idTicket; 
    private String titulo;
    
    // 'protected' permite que este atributo sea accesible directamente por:
    // 1. Esta misma clase.
    // 2. Clases en el mismo paquete.
    // 3. Clases que hereden de ella (sus clases hijas/nietas).
    protected boolean resuelto; 
    
    public TareaBase (String idTicket, String titulo, boolean resuelto){
        this.idTicket = idTicket;
        this.titulo = titulo;
        this.resuelto = resuelto; 
    } 

    // Este método será heredado tal cual a todos los hijos y nietos.
    public void marcaResuelto(){
        this.resuelto = true;
        System.out.printf("El ticket %s ha sido cerrado\n", this.idTicket);  
        System.out.printf("Nombre del ticket %s\n",this.titulo);
    } 
    
    // Método por defecto que las clases hijas pueden cambiar (sobreescribir).
    public int calcularPrioridad(){        
        return 1;
    } 
    
} // Fin de class TareaBase