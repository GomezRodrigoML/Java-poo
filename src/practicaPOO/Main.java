package practicaPOO;

public class Main {
    public static void main(String[] args) {
        Persona personaVacia = new Persona();
        Persona personaFull = new Persona("Tilin", 8, "88289123", 50.0f, 1.5f);
        Persona personaMiddle = new Persona("Alan", 28, "12312312");
        String personName = personaFull.getNombre();

        System.out.println("Analizando a " + personName);

        if (personaFull.esMayorDeEdad()) {
            System.out.println(personName + " es mayor.");
        } else {
            System.out.println(personName + " es menor.");
        }

        switch (personaFull.calcularIMC()) {
            case 1:
                System.out.println(personName + " esta en sobre peso...muy mal.");
                break;
            case 0:
                System.out.println(personName + " tiene el peso ideal, muy bien.");
                break;
            case -1:
                System.out.println(personName + " esta bajo peso...muy mal.");
                break;
        }

        System.out.println(personaFull);
    }
}
