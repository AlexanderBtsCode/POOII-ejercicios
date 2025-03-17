
package ejercicios2;

import java.util.Scanner;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){//Solicito al usuario los datos de la persona
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        this.nombre =teclado.nextLine();
        System.out.println("Ingrese su apellido: ");
        this.apellido= teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        this.edad = teclado.nextInt();
        
        
        this.visualizarDatos();
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void visualizarDatos(){
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
        if(this.edad>= 18) System.out.println("Condicion :MAYOR DE EDAD");
        else System.out.println("Condicion : MENOR DE EDAD");

        
    }
    
}
