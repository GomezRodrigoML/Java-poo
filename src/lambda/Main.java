package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculoList = new ArrayList<>();
        vehiculoList.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculoList.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculoList.add(new Vehiculo("Ford", "Explorer", 2500));

        vehiculoList.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculoList.add(new Vehiculo("Fiat", "Chronos", 1000));
        vehiculoList.add(new Vehiculo("Fiat", "Torino", 1250));

        vehiculoList.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculoList.add(new Vehiculo("Chevrolet", "Spin", 2500));

        vehiculoList.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculoList.add(new Vehiculo("Toyota", "Fortuner", 3000));

        vehiculoList.add(new Vehiculo("Renault", "Logan", 950));

        Garage nuestroGarage = new Garage("abc", vehiculoList);

        vehiculoList.sort((vehiculo1, vehiculo2) -> {
            //vehiculo1.getCosto().compareTo();
            if (vehiculo1.getCosto() > vehiculo2.getCosto()) return 1;
            if (vehiculo2.getCosto() > vehiculo1.getCosto()) return -1;

            return 0;
        });

        /*List<Vehiculo> lista1 = vehiculoList.stream().sorted((vehiculo1, vehiculo2) -> {
            if (vehiculo1.getCosto() > vehiculo2.getCosto()) return 1;
            if (vehiculo2.getCosto() > vehiculo1.getCosto()) return -1;

            return 0;
        }).collect(Collectors.toList());*/

        System.out.println("ORDENADOS POR PRECIO");
        vehiculoList.forEach(vehiculo -> System.out.println(vehiculo));
        System.out.println("____________________");
        System.out.println("ORDENADOS POR MARCA Y POR PRECIO");
        //Comparator<Person> comparator = Comparator.comparing(person -> person.name);
        //    comparator = comparator.thenComparing(Comparator.comparing(person -> person.age));
        List<Vehiculo> lista2 = vehiculoList.stream().sorted((vehiculo1, vehiculo2) -> {
            String m1 = vehiculo1.getMarca();
            String m2 = vehiculo2.getMarca();
            int compResult = m1.compareTo(m2);

            if (compResult != 0) {
                return compResult;
            }

            if (vehiculo1.getCosto() > vehiculo2.getCosto()) return 1;
            if (vehiculo2.getCosto() > vehiculo1.getCosto()) return -1;

            return 0;
        }).collect(Collectors.toList());

        lista2.forEach(vehiculo -> System.out.println(vehiculo));
        System.out.println("____________________");

        List<Vehiculo> menoresAMil = vehiculoList.stream().filter(vehiculo -> vehiculo.getCosto() < 1000).collect(Collectors.toList());
        System.out.println("PRECIO MENOR A 1000");
        menoresAMil.forEach(vehiculo -> System.out.println(vehiculo));
        System.out.println("____________________");

        List<Vehiculo> mayorAMIL = vehiculoList.stream().filter(vehiculo -> vehiculo.getCosto() >= 1000).collect(Collectors.toList());
        System.out.println("PRECIO MAYOR O IGUAL A 1000");
        mayorAMIL.forEach(vehiculo -> System.out.println(vehiculo));
        System.out.println("____________________");

        IntStream total = nuestroGarage.getVehiculos().stream().mapToInt(v -> v.getCosto());
        //System.out.println("EL PROMEDIO ES: " + total.sum() / vehiculoList.size());
        System.out.println("EL PROMEDIO ES: " + total.average().getAsDouble());
        System.out.println("____________________");
    }
}
