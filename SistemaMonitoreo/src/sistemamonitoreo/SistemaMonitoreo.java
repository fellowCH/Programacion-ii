package sistemamonitoreo;
import java.util.Scanner;

public class SistemaMonitoreo {


    public static void main(String[] args) {
        
        SensorAmbiental prueba = new SensorAmbiental("AB:CD:EF:GH:IJ", 100.00, 0, true);
        
        Scanner scan = new Scanner(System.in);
        boolean cicloActivo = true;
        char seleccionMenu = 'a';
        
        while(cicloActivo){
            
            System.out.println("Menu de Control");
            System.out.println("1. Ingresar nueva Lectura Termica");
            System.out.println("2. Actualizar lectura del Higrometro");
            System.out.println("3. Solicitud de diagnostico completo");
            System.out.println("4. Inicio de Secuencia de Apagado");
            System.out.print("Seleccion: ");
            seleccionMenu = scan.next().charAt(0);
            
            switch (seleccionMenu){
                
                case '1':
                    
                    System.out.println("Ingresa temperatura: ");
                    double nuevaTemp = scan.nextDouble();
                    prueba.setTemperaturaCelsius(nuevaTemp);
                    break;
                    
                case '2':
                    
                    System.out.println("Actualizar lectura del higrometro");
                    int nuevaHR = scan.nextInt();
                    prueba.setHumedadRelativa(nuevaHR);
                    break;
                    
                case '3':
                    
                    prueba.reporteEstado();
                    break;
                    
                case '4':
                    
                    cicloActivo = false;
                    System.out.println("Cerrando sistema XD");
                    break;
                    
                default:
                    System.out.println("BROSKI... La cosa es del 1 al 4...");
                    System.out.println("selecciona otra opcion.");
                    
            } // Fin de switch
            
        } // Fin de While
        
    } // Fin de Main
    
} // Fin de Class
