package practicaPOO;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public int calcularIMC() {
        float result = (float) (peso / Math.pow(altura, 2));

        if (result < 20) return -1;
        if (result <= 25) return 0;

        return 1;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + calcularIMC() +
                ", esMayor=" + esMayorDeEdad();
    }
}
