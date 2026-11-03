package ecosistema_smart_home;


public class FocoInteligente extends Dispositivo implements Conexiones{
    
    public FocoInteligente(String marca){
        
        super(marca);
        
    } // Fin de constructor
    
    @Override
    void encender(){
        System.out.println("Foco encendido al 100%");       
    }
    
    @Override
    public void conectarRed(){
        System.out.println("Conectando al router via WiFi");
    }
    
} // Fin de FocoInteligente
