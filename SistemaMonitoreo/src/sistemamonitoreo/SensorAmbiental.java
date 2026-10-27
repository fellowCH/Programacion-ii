
package sistemamonitoreo;


public class SensorAmbiental {
    
    // Atributos
    private String codigoMAC;
    private double temperaturaCelsius;
    private int humedadRelativa;
    private boolean estado;
    
    public SensorAmbiental(String codigo, double temp, int humedad, boolean est){
        
        this.codigoMAC = codigo;
        this.temperaturaCelsius = temp;
        this.humedadRelativa = humedad;
        this.estado = est;
              
    } // Fin de SensorAmbiental

    // TODOS LOS GET
    public String getCodigoMAC() {
        return codigoMAC;
    }
    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
    public int getHumedadRelativa() {
        return humedadRelativa;
    }
    public boolean isEstado() {
        return estado;
    }

    
    // TODOS LOS SET
    public void setCodigoMAC(String codigo) {
        this.codigoMAC = codigoMAC;
    } // Fin de setCodigoMAC
    public void setTemperaturaCelsius(double tempC) {
        
        if (tempC >= -40 && tempC <= 125){
            
            this.temperaturaCelsius = tempC;
            
        } else {
            
            System.out.println("Alerta de Seguridad");
            System.out.println("Lectura de Temp. descartada");
            System.out.println("Fuera de rango");
            
        } // Fin de IF
             
    } // Fin de setTemperaturaCelsius
    public void setHumedadRelativa(int hr) {
        
        if (hr < 0 || hr > 100){
            
            System.out.println("Advertencia");
            System.out.println("Lectura erronea...");
            this.humedadRelativa = 0;
            
        } else {
            
            this.humedadRelativa = hr;
            System.out.println("HR ACTUALIZADO");
            
        } // Fin de IF
        
    } // Fin de setHumedadRelativa
    public void setEstado(boolean estado) {
        this.estado = estado;
    } // Fin de setEstado
    
    public void reporteEstado(){
        
        System.out.printf("Temperatura: %.2f\n", this.temperaturaCelsius);
        System.out.printf("Humedad relativa: %d\n", this.humedadRelativa);
        System.out.printf("CodigoMAC: %s\n", this.codigoMAC);
        System.out.printf("Estado: %b\n", this.estado);
        
    }
    
} // Fin de Class
