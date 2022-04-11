package animales;

public class Perro extends Animal implements Carnivoro {
    private String name;

    public Perro(String name) {
        this.name = name;
    }

    @Override
    void emitirSonido() {
        System.out.println("Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("El perro come carne");
    }

    @Override
    boolean esComestible() {
        return false;
    }

    @Override
    public String toString() {
        return "Perro";
    }
}
