package KataTres;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto libro
        Libro l = new Libro();
        
        // Le asignamos valores a cada atirbuto
        l.setTitulo("Cien años de soledad");
        l.setAutor("Gabriel García Márquez");
        l.setAnioPublicacion(2026);// Seteamos un año no valido
        
        // Mostramos la informacion habiendo seteado un año invalido
        l.mostrarInfo();
        System.out.println(""); // Salto de linea para ver mas prolija la consola
        l.setAnioPublicacion(1967); // Seteamos un año valido
        l.mostrarInfo(); // Mostramos la informacion con todos los datos cargados correctamente
    }
    
}
