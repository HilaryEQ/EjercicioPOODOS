package ejercicio2;

import ejercicio2.mascota.Mascota;

public class Entrada {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota("Luna","Gato",3);
        Mascota mascota2 = new Mascota("Toby","Perro",5);

        System.out.println("Mascota 1 :"+mascota1.nombre+" - "+mascota1.clase+" - "+mascota1.edad+" años");
        System.out.println("Mascota 2 :"+mascota2.nombre+" - "+mascota2.clase+" - "+mascota2.edad+" años");

    }
}
