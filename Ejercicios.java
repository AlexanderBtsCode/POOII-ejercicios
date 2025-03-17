
package ejercicios;

public class Ejercicios {


    public static void main(String[] args) {
        //programa que permita sobrecargar un construtctor que defina un circulo  con un valor predeterminado o con un valor elegido por el usuario(radio)
        
        Circulo circulo = new Circulo();
        Circulo circulo1 = new Circulo(10);
        System.out.println("El primer objeto tiene como radio "+circulo.getRadio());
        System.out.println("Y su área es: "+circulo.calcularArea());
        
        System.out.println("El segundo objeto tiene como radio "+circulo.getRadio());
        System.out.println("Y su área es: "+circulo1.calcularArea());
    }
}
