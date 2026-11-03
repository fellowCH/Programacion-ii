package ecosistema_smart_home;


public class CerraduraInteligente extends Dispositivo implements Conexiones{
    
    public CerraduraInteligente(String marca){
        
        super(marca);
        
    } // Fin de constructor
    
    @Override
    void encender(){
        System.out.println("Dispositivo magentico activado");
    }
    
    @Override
    public void conectarRed(){
        System.out.println("Conexion via bluetooth");
    }
    
} // Fin de CerraduraInteligente
