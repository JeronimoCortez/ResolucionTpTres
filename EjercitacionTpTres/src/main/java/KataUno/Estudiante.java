package KataUno;

public class Estudiante {
    // Declaramos atributos privados
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Declaramos getter y setter de cada atributo para poder acceder a ellos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    // Metodo para ver la info de un estudiante
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + "\n Apellido: " + this.apellido + "\n Curso: " + this.curso + "\n Calificacion: " + this.calificacion);
    }
    
    // Metodo para subir la calificacion de un estudiante
    public void subirCalificacion(double puntos){
        this.calificacion = this.calificacion + puntos;
    }
    
    // Metodo para bajar la calificacion de un estudiante
    public void bajarCalificaion(double puntos){
        this.calificacion = this.calificacion - puntos;
    }
    
    
    
}
