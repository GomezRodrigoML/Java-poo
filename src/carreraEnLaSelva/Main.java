package carreraEnLaSelva;

/*
Todos los años en la provincia de Misiones, al norte de Argentina se lleva a cabo un evento conocido como “Carrera de la Selva”. El mismo se trata de una competición donde los mejores maratonistas y corredores de Latinoamérica se reúnen para desafiar sus habilidades deportivas.
        La competencia cuenta con 3 categorías dependiendo de su dificultad:
        Circuito chico: 2 km por selva y arroyos.
        Circuito medio: 5 km por selva, arroyos y barro.
        Circuito Avanzado: 10 km por selva, arroyos, barro y escalada en piedra.
        Cada participante puede inscribirse únicamente a una categoría y necesita, para dicha inscripción,
        proporcionar los siguientes datos:
        dni,
        nombre,
        apellido,
        edad,
        celular,
        número de emergencia
        y grupo sanguíneo.
        A cada inscripto, a la vez, se le asigna un número de participante consecutivo con respecto a la inscripción anterior; por ejemplo, si un participante se inscribe y el anterior fue el número 36, se le va a asignar el número 37.
        Para concluir con la inscripción, se debe calcular el monto a abonar por cada participante. Para ello se tienen en cuenta los siguientes valores:

        Inscripción Circuito chico: Menores de 18 años $1300. Mayores de 18 años $1500.
        Inscripción Circuito medio: Menores de 18 años $2000. Mayores de 18 años $2300.
        Inscripción Circuito Avanzado: No se permite inscripciones a menores de 18 años. Mayores de 18 años $2800

        A partir de estos datos brindados, los organizadores de la carrera manifestaron que necesitan de una aplicación que sea capaz de:

        Inscribir a un nuevo participante en una categoría. (Tener en cuenta que cada categoría tiene una lista de inscriptos diferente).
        Mostrar por pantalla todos los inscriptos a una determinada categoría con sus correspondientes datos y número de inscripción.
        Desinscribir a un participante de una categoría.
        Determinar el monto que deberá abonar cada participante al inscribirse. Por ejemplo: si el participante se inscribe a la categoría Circuito chico y tiene 21 años, el monto a abonar es de $1500.
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String[] inscribir() {
        String[] toRet = new String[9];

        final Scanner teclado = new Scanner(System.in);
        int cat, age, dni, phone, emergencyPhone, price;

        String name, surname, bloodType;

        System.out.println("¿Cual es la edad del participante??");
        age = Integer.parseInt(teclado.nextLine());

        System.out.println("¿En que categoria vamos a inscribir?");
        cat = Integer.parseInt(teclado.nextLine());


        switch (cat) {
            case 1:
                if (age < 18) toRet[8] = "1300";
                else toRet[8] = "1500";
                break;
            case 2:
                if (age < 18) toRet[8] = "2000";
                else toRet[8] = "2300";
                break;
            case 3:
                if (age < 18) {
                    System.out.println("El participante es menor de edad y no se puede inscribir en esta categoria");
                    return toRet;
                }

                toRet[8] = "2800";
                break;
            default:
                System.out.println("Categoria incorrecta");
                return toRet;
        }

        System.out.println("Otros Datos del participante");
        System.out.println("DNI:");
        dni = Integer.parseInt(teclado.nextLine());
        System.out.println("Telefono:");
        phone = Integer.parseInt(teclado.nextLine());
        System.out.println("Numero de emergencias:");
        emergencyPhone = Integer.parseInt(teclado.nextLine());
        System.out.println("Nombre:");
        name = teclado.nextLine();
        System.out.println("Apellido:");
        surname = teclado.nextLine();
        System.out.println("Grupo sanguineo:");
        bloodType = teclado.nextLine();


        teclado.close();
        toRet[0] = name;
        toRet[1] = surname;
        toRet[2] = bloodType;
        toRet[3] = dni + "";
        toRet[4] = phone + "";
        toRet[5] = emergencyPhone + "";
        toRet[6] = age + "";
        toRet[7] = cat + "";

        return toRet;
    }

    public static void main(String[] args) {
        int id = 0;
        ArrayList<HashMap<Integer, String[]>> inscriptos = new ArrayList<>();

        /*System.out.println("indice" + id);
        String[] stringsArray = {"roberto", "perez", "3123123", "2664", "2664", "A+"};

        test.put(id, stringsArray);

        inscriptos.add(test);

        */

        String[] participante = inscribir();
        HashMap<Integer, String[]> aux = new HashMap<>();
        aux.put(id++, participante);

        inscriptos.add(aux);

        for (int i = 0; i < inscriptos.size(); i++) {
            HashMap<Integer, String[]> info = inscriptos.get(i);
            String[] infoString = info.get(i);

            for (int j = 0; j < infoString.length; j++) {
                System.out.println(infoString[j]);
            }
        }
    }
}
