
package ejercicios3;


public class Caseta {
    private float montoRecaudado;

    public float getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(float montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
    
    public void cobraPeaje(Vehiculo vehiculo){
        System.out.println("Ha pasado un vehiculo de tipo" +vehiculo.getTipo());
            System.out.println("Se le ha cobrado S/." +vehiculo.getTarifa());
            this.montoRecaudado += vehiculo.getTarifa();

    }
}
