package KataDos;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto mascota y le asignamos valores a sus atributos
        Mascota m = new Mascota();
        m.setNombre("Luna");
        m.setEspecie("Perro");
        m.setEdad(5);
        
        // Mostramos su informacion
        m.mostrarInfo();
        m.cumplirAnios(); // Subimos 1 año
        m.cumplirAnios(); // Subimos 1 año
        System.out.println("");
        // Mostramos info despues de que la mascota envejecio 2 años
        m.mostrarInfo();
    }
    
}
