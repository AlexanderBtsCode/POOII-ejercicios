
package ejercicios3;


public class Vehiculo {
    private int codigo; //codigo que indica el tipo de vehiculo : 0, moto = 1, liviano 2 , mediano, 3 pesado
    
    private String tipo; // cadena que muestra el tipo de vehiculo
    private float tarifa; // monto que se paga de acuerdo al tipo de vehiculo
    
    public Vehiculo(){// constructor
        //genera numeros al azar entre 0 y 3 y con ello determina el tipo de  vehiculo y su tarifa
        
        int tipoAleatorio = generaAleatorio(0,3);
        switch(tipoAleatorio){
            case 0 : {
                this.codigo = 0;
                this.tipo =  "moto";
                this.tarifa = 0;
                break;
            }
            case 1 : {
                this.codigo = 1;
                this.tipo = " liviano";
                this.tarifa = (float) 6.60;
                break;
            }
            case 2 : {
                this.codigo = 2;
                this.tipo = " mediano";
                this.tarifa = (float) 7.60;
                break;
        }
            case 3 : {
                this.codigo = 3;
                this.tipo = " pesado";
                this.tarifa = (float) 11.10;
                break;
    }
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
    private int generaAleatorio(int inicio, int fin) {
        return (int)(Math.random()*(fin-inicio+1)+inicio);
    }
}
