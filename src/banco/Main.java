package banco;

public class Main {
    public static void main(String[] args) {
        Basico clienteBasico = new Basico();
        clienteBasico.consultarSaldo();
        //
        int[] numeros = new int[5];
        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sorete");
        }

    }
}
