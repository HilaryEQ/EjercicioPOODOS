package ejercicio3;

import ejercicio3.librosunoydos.Libro;

public class Entradauno {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Principito","Antonie de Saint-Exupery", 96);

        System.out.println("Libro 1: "+libro1.titulo+" - "+libro1.autor+" - "+libro1.paginas+" paginas");
        System.out.println("Libro 2: "+libro2.titulo+" - "+libro2.autor+" - "+libro2.paginas+" paginas");
    }
}
