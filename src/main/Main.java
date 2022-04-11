package main;

public class Main {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aries", "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        Integer[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int vector[] = new int[5];
        
        String ciudadMenorTemp = "";
        String ciudadMayorTemp = "";
        int menorTemp = 0;
        int mayorTemp = 0;

        for (int i = 0; i < ciudades.length; i++) {
            if (i == 0) {
                ciudadMenorTemp = ciudades[i];
                ciudadMayorTemp = ciudades[i];
                menorTemp = temperaturas[i][0];
                mayorTemp = temperaturas[i][1];
                continue;
            }

            if (temperaturas[i][0] < menorTemp) {
                menorTemp = temperaturas[i][0];
                ciudadMenorTemp = ciudades[i];
            }

            if (temperaturas[i][1] > mayorTemp) {
                mayorTemp = temperaturas[i][1];
                ciudadMayorTemp = ciudades[i];
            }
        }

        System.out.println("La mayor temperatura la tiene " + ciudadMayorTemp + " con " + mayorTemp + " Cº");
        System.out.println("La menor temperatura la tiene " + ciudadMenorTemp + " con " + menorTemp + " Cº");
    }
}
