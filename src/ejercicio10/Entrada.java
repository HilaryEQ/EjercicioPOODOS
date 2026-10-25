package ejercicio10;

public class Entrada {
    public static void main(String[] args) {
        Movil movil1 = new Movil("Samsung","Galaxy A15");
        Movil movil2 = new Movil("Xiaomi","Redmi Note 13",128);
        Movil movil3 = new Movil("Apple","Iphone 15",256,true);

        System.out.println("Movil 1:"+movil1.marca+" - "+movil1.modelo+" - "+movil1.almacenamiento+"GB - "+movil1.encendido);
        System.out.println("Movil 2:"+movil2.marca+" - "+movil2.modelo+" - "+movil2.almacenamiento+"GB - "+movil2.encendido);
        System.out.println("Movil 3:"+movil3.marca+" - "+movil3.modelo+" - "+movil3.almacenamiento+"GB - "+movil3.encendido);


    }
}
