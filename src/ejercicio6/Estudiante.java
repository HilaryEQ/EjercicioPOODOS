package ejercicio6;

public class Estudiante {

    String curso, nombre;
    boolean matriculado;

    public Estudiante (){}


    public Estudiante (String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = false;
    }

    public Estudiante (String nombre, String curso , boolean matriculado){
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = matriculado;
    }





}
