package gestiontickets;

// La palabra reservada 'extends' indica que Bugs es hija de TareaBase.
// Hereda sus atributos y métodos.
public class Bugs extends TareaBase {
    
    private String entorno;
    
    public Bugs(String idTicketHIJO, String tituloHIJO, boolean resueltoHIJO, String entorno){ 
        
        // 'super' llama al constructor de la clase Padre (TareaBase).
        // Es OBLIGATORIO que sea la primera línea del constructor.
        // Le pasamos al padre los datos que le corresponden para que él los inicialice.
        super(idTicketHIJO, tituloHIJO, resueltoHIJO); 
        this.entorno = entorno;
        
    } 
    
    // @Override es una anotación que le dice a Java: "Voy a reemplazar el comportamiento 
    // del método calcularPrioridad() que heredé de mi padre". A esto se le llama Polimorfismo.
    @Override
    public int calcularPrioridad(){        
        if(this.entorno.equals("Produccion")){
            return 3;
        } else {
            return 2;
        }
    } 
    
} // Fin de Class Bugs