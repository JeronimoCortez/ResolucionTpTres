package KataCinco;

public class Main {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Exploradora 1");
        nave.setCombustible(50);

        System.out.println("Estado inicial:");
        nave.mostrarEstado();
        nave.despegar();
        nave.mostrarEstado();

        System.out.println("Intentando avanzar 30 km:");
        nave.avanzar(30);

        System.out.println("Recargando 40 unidades de combustible:");
        nave.recargarCombustible(30);

        System.out.println("Intentando avanzar 20 km:");
        nave.avanzar(20);

        System.out.println("Estado final:");
        nave.mostrarEstado();
    }

}
