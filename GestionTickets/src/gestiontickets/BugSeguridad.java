package gestiontickets;

// BugSeguridad hereda de Bugs. Al ser una cadena, hereda de Bugs y también de TareaBase.
public class BugSeguridad extends Bugs {
    
    private String codigoCVE;
    private boolean datosExpuestos;
    
    // El constructor recibe todos los parámetros necesarios para esta clase y para sus ancestros.
    public BugSeguridad(String idTicketNIETO, String idTituloNIETO, boolean resueltoNIETO, String entornoHIJO, String codigoCVE, boolean datosEXP){
        
        // 'super' llama al constructor de la clase Padre inmediata (Bugs).
        // Bugs espera 4 parámetros, así que le pasamos esos 4.
        // Bugs a su vez, tomará los primeros 3 y se los pasará a TareaBase.
        super(idTicketNIETO, idTituloNIETO, resueltoNIETO, entornoHIJO);
        
        // Finalmente inicializamos los atributos que son exclusivos de BugSeguridad.
        this.codigoCVE = codigoCVE;
        this.datosExpuestos = datosEXP;
        
    } 
    
} // Fin de Class BugSeguridad