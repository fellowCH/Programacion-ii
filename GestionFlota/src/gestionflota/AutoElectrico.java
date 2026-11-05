package gestionflota;


public class AutoElectrico extends VehiculoBase implements IConducible, IElectrico{
    
    private int nivelBateria;
    
    public AutoElectrico (String marca, double precio, int bateria){
        
        super(marca, precio);
        this.nivelBateria = bateria;
        
    }

    // Setter y Getter de nivelBateria
    
    public int getNivelBateria() {
        return nivelBateria;
    } // Fin de GET

    public void setNivelBateria(int nivelBateria) {
        
        if (nivelBateria >= 0 && nivelBateria <= 100){
            
            this.nivelBateria = nivelBateria;
            
        } else {
            
            System.out.println("Valor no posible");
            this.nivelBateria = 0;
            
        } // Fin de IF
        
    } // Fin de SET
    
    @Override
    public void cargaBateria(int horas){
        
        System.out.printf("Conectando %s a la red de la ENEE. \n", getMarca());
        System.out.printf("Tiempo estimado de carga: %d\n", horas);
        
    } // Fin de cargaBateria
    
    @Override
    public void encenderMotor (String tipoLlave){
        
        System.out.println("SE ESTA ENCIENDO EL CARRO XDD");
        System.out.println("LA LLAVE ES: " + tipoLlave);
        this.enMovimiento = true;
        
    } // Fin de encenderMotor
    
    @Override
    public void mostrarDatosVehiculo(){
        
        revisarSistemasInternos();
        System.out.printf("Precio: %.2f", getPrecio());
        System.out.printf("Marca: %s", getMarca());
        System.out.printf("Carga de Bateria: %d", getNivelBateria());
        
    } // Fin de mostrarDatosVehiculo
    
} // Fin de CLASS
