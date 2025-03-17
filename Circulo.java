
package ejercicios;

import static java.lang.Math.PI;

public class Circulo {
    private float radio; //atributos privados
    private float diametro;
    
    public Circulo(){
        this.radio = 0; //el constructor por defecto asigna 0 como estado del atributo
        
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
    
    public Circulo(float radio){
        this.radio = radio; //this fuerza a que se refiera al atributo  de
        // la clase evitando asi la ambiguedad 
        
    }
    public float calcularArea(){
        return (float) (PI*radio*radio);
        
    }
    
}
