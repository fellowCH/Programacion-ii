package sistemaestudiante;

public class Estudiante {
    
    /*
    Modificadores de Acceso:
        1. public: Accesible desde cualquier clase.
        2. private: Accesible únicamente DENTRO de esta misma clase.
        3. protected: Accesible dentro del mismo paquete y clases hijas (herencia).
        4. (default / package-private): Accesible por cualquier clase del mismo paquete.
    */
   
    // Atributos (Variables)
    private int edad;
    private double estatura;
    
    String nombre;
    String apellido;
    char genero;
    
    // Constructors
    
    public Estudiante() {
        // "this" se refiere a los atributos de la instancia actual de la clase.
        this.edad = 0;
        this.estatura = 0;
        this.nombre = "JD";
        this.apellido = "DJ";
    } // Fin del constructor Estudiante
    
    public Estudiante(int edad, double estatura) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "JD";
        this.apellido = "DJ";
    } // Fin del constructor Estudiante
    
    public void mostrarDatos() {
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Edad: %d\n", this.edad);          // %d para enteros
        System.out.printf("Estatura: %.2f m\n", this.estatura); // %.2f para decimales
    } // Fin de mostrarDatos
    
    // Getter y Setter de Edad
    public int getEdad() {        
        return this.edad;      
    } // Fin de getEdad  

    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("ERROR. Ingrese una edad válida (1 - 99)");
        } // Fin de IF
    } // Fin de setEdad

    // Getter y Setter de Género
    public char getGenero() {
        return this.genero;
    } // Fin de getGenero

    public void setGenero(char genero) {
        char gen = Character.toLowerCase(genero);
        if (gen == 'm' || gen == 'f') {
            this.genero = genero;
        } else {
            System.out.println("No es válido, ingrese F/M");
        }
    } // Fin de setGenero

    // Getters y Setters de Estatura
    public double getEstatura() {
        return this.estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        }
    }
    
} // Fin de class Estudiante