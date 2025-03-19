
package ejercicio.pkg02;

public class Ejercicio3 {
        public static void main(String[] args) {
        //Implemente un programa que utilizando POO y generación de números enteros 
        //aleatorios, simule el paso de 100 vehículos por una caseta de peaje. Considere las 
        //clases caseta y vehículo y que por cada tipo de vehículo (moto, liviano, mediano y 
                //pesado) que pasa por la caseta se cobrará un monto diferente expresado en soles. 
//Al finalizar la ejecución, el programa deberá mostrar un reporte de lo cobrado por 
//los 100 vehículos.
    Caseta caseta = new Caseta();
    int cVehiculos = 1000;
            for (int i = 1; i < cVehiculos; i++) {
                Vehiculo vehiculo =  new Vehiculo ();
                   caseta.cobraPeaje(vehiculo);
                   
            }
            System.out.println("El  monto total recaudado es : S/"+ caseta.getMontoRecaudado());            
    }
    
}

