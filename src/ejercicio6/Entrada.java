package ejercicio6;

public class Entrada {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Alex","1 DAM");
        Estudiante estudiante2 = new Estudiante("Sara", "1 DAM", true);

        System.out.println("Estudiante 1:"+estudiante1.nombre+" - "+estudiante1.curso+" - "+estudiante1.matriculado);
        System.out.println("Estudiante 2:"+estudiante2.nombre+" - "+estudiante2.curso+" - "+estudiante2.matriculado);

    }
}
