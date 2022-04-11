package animales;

public class Vaca extends Animal implements Herviboro {
    @Override
    void emitirSonido() {
        System.out.println("MMMUUUUU");
    }

    @Override
    boolean esComestible() {
        return true;
    }

    @Override
    public void comerHierba() {
        System.out.println("La vaca come pasto");
    }

    @Override
    public String toString() {
        return "Vaca";
    }
}
