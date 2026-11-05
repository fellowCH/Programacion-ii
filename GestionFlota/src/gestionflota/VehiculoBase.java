package gestionflota;


public abstract class VehiculoBase {
    
    // Atributos
    private String marca;
    private double precio;
    protected boolean enMovimiento;
    
    // Constructor
    public VehiculoBase(String marca, double precio){
        setMarca(marca);
        setPrecio(precio);
        this.marca = marca;
        this.precio = precio;
        this.enMovimiento = false;
        
    } // Fin de Constructor

    
    // Getter y Setters
       
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        
        if (marca == null || marca.trim().isEmpty()){
            
            System.out.println("No se reconoce la marca...");
            this.marca = "Sin marca";
            
        } else {
            
            this.marca = marca;
            
        } // Fin de IF
        
    } // Fin de setMarca

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        
        if (precio <1000.00){
            
            System.out.println("Precio no valido");
            System.out.println("Se asignara mil");
            this.precio = 1000.00;
            
        } else {
            
            this.precio = precio;
            
        } // Fin de IF
        
    } // Fin de setPrecio
    
    protected void revisarSistemasInternos(){
        System.out.println("REVISANDO SISTEMAS");
        System.out.println("-----------------------");
    }
    
    protected void mostrarDatosVehiculo(){        
        System.out.println("MOSTRANDO DATOS");
        System.out.println("-----------------------");
    }
    
} // Fin de class VehiculoBase
