package ecosistema_smart_home;

public abstract class Dispositivo {
    
    // Atributos
    String marca;
    
    // Constructor
    public Dispositivo(String marca){
        
        this.marca = marca;
        
    } // Fin de constructor
    
    abstract void encender();
    
    public void MostrarMarca(){
        
        System.out.println("Marca: " + this.marca);
        
    } // Fin de MostrarMarca
    
} // Fin de class Dispositivo
