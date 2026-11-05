package gestionflota;

public class CamiomCarga extends VehiculoBase implements IConducible{
    
    // Atributos
    private double capacidadCarga;
    
    public CamiomCarga (String marca, double precio, double capacidad){
        
        super (marca, precio);
        this.capacidadCarga = capacidad;
        
    }

    // Getter y Setter de capacidadCarga
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        
        if (capacidadCarga < 0){
            
            this.capacidadCarga = 0.0;
            System.out.println("Valor invalido");
            
        } else {
            
            this.capacidadCarga = capacidadCarga;
            
        } // Fin de IF
        
    } // Fin de setCapacidadCarga
    
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
        System.out.printf("Capacidad carga: %.2f\n", getCapacidadCarga());
        
    } // Fin de mostrarDatosVehiculo
    
} // Fin de CLASS CamiomCarga
