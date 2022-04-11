package animales;

public class Gato extends Animal implements Carnivoro {
    @Override
    void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("El gato come pescado");
    }

    @Override
    boolean esComestible() {
        return false;
    }

    @Override
    public String toString() {
        return "Gato";
    }
}
