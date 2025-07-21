package KataCuatro;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto gallina y le asignamos valores a sus atributos
        Gallina g = new Gallina();
        g.setIdGallina("abc123");
        g.setEdad(1);
        g.setHuevosPuestos(0);
        
        Gallina g2 = new Gallina();
        g2.setIdGallina("abc124");
        g2.setEdad(2);
        g2.setHuevosPuestos(5);
        
        // Mostramos el estado inicial de las gallinas
        g.mostrarEstado();
        g2.mostrarEstado();
        
        // Llamamos 3 veces al metodo ponerHuevo de cada gallina
        g.ponerHuevo();
        g.ponerHuevo();
        g.ponerHuevo();
        
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        
        // Llamamos una vez al metodo envejecer de cada gallina
        g.envejecer();
        g2.envejecer();
        
        // Mostramos el nuevo estado de las gallinas
        g.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
