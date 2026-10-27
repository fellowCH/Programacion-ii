package sistemaseguridad;

import java.util.Scanner;


public class SistemaSeguridad {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Seguridad accesoDC = new Seguridad(2007);
        boolean panelEncendido = true;
        int opcionSeleccion = 0;
        int valorBateria;
        
        System.out.println("Menu de Opciones");
        
        while(panelEncendido = true){
            
            System.out.println("Menu de Opciones");
            System.out.println("1. Intentar abrir la puerta.");
            System.out.println("2. Cambiar codigo de PIN");
            System.out.println("3. Alternar estado emergencia");
            System.out.println("4. Mantenimiento");
            System.out.println("5. Apagar terminal de puerta");
            System.out.print("Seleccion: ");
            opcionSeleccion = scan.nextInt();
            
            switch (opcionSeleccion){
                
                case 1:
                    System.out.println("Ingrese el codigo");
                    int intentoClave = scan.nextInt();
                    boolean resultadoIntento = accesoDC.validarPin(intentoClave);
                    if (accesoDC.getBateriaRespaldo() < 5 ){
                        System.out.println("Error de energia");    
                        
                    } else if (accesoDC.isModoLockdown()){
                        
                        System.out.println("Modo encierro activado");
                        
                    } else if (!resultadoIntento) {
                        
                        System.out.println("Credencial no valida");
                        valorBateria = accesoDC.getBateriaRespaldo();
                        accesoDC.setBateriaRespaldo(valorBateria - 15);
                        
                    } else {
                        
                        System.out.println("Acceso concedido");
                        valorBateria = accesoDC.getBateriaRespaldo();
                        accesoDC.setBateriaRespaldo(valorBateria - 5);
                    }
                    
                    break;
            }
            
        } // Fin de While
        
        
    } // Fin de Main
    
} // Fin de Class
