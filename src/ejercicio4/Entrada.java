package ejercicio4;

import ejercicio4.producto.Producto;

public class Entrada {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto("Mochila",25.2);

        System.out.println("Producto 1 :"+producto1.nombre+ " - "+producto1.precio);
        System.out.println("Producto 2 :"+producto2.nombre+ " - "+producto2.precio);

    }
}
