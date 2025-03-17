
package ejercicios3;


public class Ejercicios3 {

    public static void main(String[] args) {
        //Implemente un programa que utilizando POO y generación de números enteros 
        //aleatorios, simule el paso de 100 vehículos por una caseta de peaje. Considere las 
        //clases caseta y vehículo y que por cada tipo de vehículo (moto, liviano, mediano y 
                //pesado) que pasa por la caseta se cobrará un monto diferente expresado en soles. 
//Al finalizar la ejecución, el programa deberá mostrar un reporte de lo cobrado por 
//los 100 vehículos.
    Caseta caseta = new Caseta();
    Vehiculo vehiculo = new Vehiculo();
    
    caseta.cobraPeaje(vehiculo);
    }
    
}
