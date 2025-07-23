package KataUno;

public class Main {

    public static void main(String[] args) {
        // Creamos objeto estudiante y le asignamos valores a sus atributos
        Estudiante e = new Estudiante();
        e.setNombre("Juan");
        e.setApellido("Perez");
        e.setCurso("Comision 1");
        e.setCalificacion(8.0);
        
        // Llamamos al metodo mostrar info
        e.mostrarInfo();
        
        e.subirCalificacion(2.0); // Subimos dos puntos su calificacion
        System.out.println(""); // Salto de linea para que veamos la consola mas prolija
        e.mostrarInfo(); // Verificamos que se haya subido la calificacion
        
        e.bajarCalificaion(1.0); // Bajamos un punto la calificacion
        System.out.println(""); // Salto de linea para que veamos la consola mas prolija
        e.mostrarInfo(); // Verificamos que se haya bajado la calificacion
    }
    
}
