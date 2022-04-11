package poo_P2;

public class PracticaExcepciones {
    public static void main(String[] args) {
        int a = 300, b = 0, result;

        try {
            result = a / b;
        } catch (ArithmeticException arithmeticException) {
            //System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        System.out.println("Programa Finalizado");
    }
}
