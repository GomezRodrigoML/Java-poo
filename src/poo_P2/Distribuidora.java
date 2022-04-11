package poo_P2;

/*Crear una clase ejecutable llamada Distribuidora donde van a crear un array de productos,
 imprimir el precio total al vender 5 productos de cada tipo.
 Crear los elementos del array con los datos que quieras.*/

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        Perecedero leche = new Perecedero("Leche La Serenisima", 130.0, 1);
        productos.add(leche);

        Producto manteca = new Perecedero("Manteca", 200.0, 2);
        productos.add(manteca);
        Producto carneMolida = new Perecedero("Medio de Molida", 500.0, 3);
        productos.add(carneMolida);
        Producto dulceDeLeche = new Perecedero("Dulce de leche", 250.0, 10);
        productos.add(dulceDeLeche);
        Producto membrillo = new Perecedero("Membrillo", 130.0, 15);
        productos.add(membrillo);
        Producto fideoTirabuzon = new NoPerecedero("Fideos Tirabuzon", 100.0, "Fideos");
        productos.add(fideoTirabuzon);
        Producto arroz = new NoPerecedero("Arroz", 100.0, "Arroz");
        productos.add(arroz);
        Producto fideoSpagueti = new NoPerecedero("Fideo largo", 100.0, "Fideo");
        productos.add(fideoSpagueti);
        Producto atun = new NoPerecedero("Atun", 250.0, "Enlatados");
        productos.add(atun);
        Producto picadilloDeCarne = new NoPerecedero("Picadillo", 100.0, "Enlatados");
        productos.add(picadilloDeCarne);

        System.out.println(leche);
        double precioLeche = leche.calcular(5);
        System.out.println("El precio de vender 5 leches es: " + precioLeche);

        leche.setDiasPorCaducar(2);
        precioLeche = leche.calcular(5);

        System.out.println("Leche con 2 dias de caducidad: " + precioLeche);

        leche.setDiasPorCaducar(3);
        precioLeche = leche.calcular(5);

        System.out.println("Leche con 3 dias de caducidad: " + precioLeche);

        leche.setDiasPorCaducar(10);
        precioLeche = leche.calcular(5);

        System.out.println("Leche con 10 dias de caducidad: " + precioLeche);

        System.out.println(arroz);
        double precioArroz = arroz.calcular(5);
        System.out.println("El precio de vender 5 arroz es: " + precioArroz);
    }
}
