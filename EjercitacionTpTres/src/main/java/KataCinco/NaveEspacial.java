package KataCinco;

public class NaveEspacial {
    // Declaramos atributos privados y meotodos getter y setter
    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    // Metodo despegar
    public void despegar(){
        if(this.combustible >= 5) { // Verficamos que la nave tenga suficiente combustible para despegar
            System.out.println("La nave despego...");
            this.combustible -= 5; // Si despega se le restan las unidades necesarias para su depegue
        } else {
            System.out.println("No hay suficiente combustible"); 
        }
    }
    
    // Metodo avanzar, recibe una distancia como parametro
    public void avanzar(int distancia) {
        if((distancia * 2) <= this.combustible){ // Cada km consumo 2 unidades de combustible verificamos que la nave tenga suficiente para la distancia
            System.out.println("La nave avanzo " + distancia + " kms");
            this.combustible -= (distancia * 2); // En el caso que haya podido avanzar se le resta el combustible dedicado a los kms
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }
    
    // Metodo recarga de combustible, recibe cantidad como parametro
    public void recargarCombustible(int cantidad){
        int maximo = 100; // Declaramos un maximo
        if((cantidad + this.combustible) <= maximo){ // Verificamos que el combustible no supere al maximo de la nave
            this.combustible += cantidad; // Si no lo supera se realiza la recarga
        } else{
            System.out.println("Ha ingresado demasiado combustible");
        }
    }
    
    // Metodo para mostrar el estado de la nave
    public void mostrarEstado(){
        System.out.println("Nombre: " + this.nombre +", combustible: " + this.combustible);
    }
}
