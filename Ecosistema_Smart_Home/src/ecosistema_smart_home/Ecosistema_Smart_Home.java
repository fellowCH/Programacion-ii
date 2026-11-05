package ecosistema_smart_home;

public class Ecosistema_Smart_Home {

    public static void main(String[] args) {

//        Dispositivo foco = new Dispositivo("Phillips");
        Dispositivo miCasa[] = {
            new FocoInteligente("Phillips"),
            new CerraduraInteligente("Yale")

        };

        miCasa[0].encender();
        miCasa[0].MostrarMarca();
        ((Conexiones) miCasa[0]).conectarRed();

        System.out.println("------------------");
        miCasa[1].encender();
        miCasa[1].MostrarMarca();
        ((Conexiones) miCasa[1]).conectarRed();

    } // Fin de main

} // Fin de class
