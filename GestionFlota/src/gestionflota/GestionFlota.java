package gestionflota;

import java.util.Scanner;

public class GestionFlota {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        VehiculoBase[] flota = new VehiculoBase[5];
        
        String marca = "";
        int bateria = 0;
        double precio = 0.00;
        int capacidadCarga = 0;
        int contador = 0;
        int seleccion = 0;
        
        do {
            
            System.out.println("MENU");
            System.out.println("1. Registrar auto electrico");
            System.out.println("2. Registrar camion de carga");
            System.out.println("3. Mostrar Flota");
            System.out.println("4. Salir");
            
            seleccion = sc.nextInt();
            sc.nextLine();
            
            switch (seleccion) {
                
                case 1:
                    
                    System.out.println("Registro de auto electrico:");
                    System.out.println("Ingrese la marca");
                    marca = sc.nextLine().toUpperCase();
                    System.out.println("Ingrese el precio:");
                    precio = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese nivel de la bateria");
                    bateria = sc.nextInt();
                    sc.nextLine();
                    
                    flota[contador] = new AutoElectrico(marca, precio, bateria);
                    contador++; 
                    System.out.println("Carro electrico registrado");
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Registro de camion:");
                    System.out.println("Ingrese la marca");
                    marca = sc. nextLine().toUpperCase();
                    sc.nextLine();
                    System.out.println("Ingrese el precio:");
                    precio = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese la capacidad de carga");
                    capacidadCarga = sc.nextInt();
                    
                    flota[contador] = new CamiomCarga(marca, precio, capacidadCarga);
                    contador++; 
                    System.out.println("Camion registrado!!");
                    
                    break;
                    
                case 3:
                    
                    for (int i = 0; i < contador; i++) {
                        flota[i].mostrarDatosVehiculo();
                        
                        if(flota[i] instanceof IConducible){
                            
                            ((IConducible)flota[i]).encenderMotor("Llave Maestra");
                            
                        }
                        
                        if(flota[i] instanceof IConducible){
                            
                            ((IElectrico)flota[i]).cargaBateria(100);
                        
                        }
                        
                    }
                    
                    break;
                    
                case 4:
                    
                    
                    break;
                    
            }
            
            
        } while (true);
        
    } // Fin de MAIN
    
} // Fin de CLASS
