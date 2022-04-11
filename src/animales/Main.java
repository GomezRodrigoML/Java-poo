package animales;

public class Main {
    public static void main(String[] args) {
        Perro boby = new Perro("Boby");
        Gato michi = new Gato();
        Vaca lola = new Vaca();

        boby.comerCarne();
        boby.emitirSonido();

        michi.comerCarne();
        michi.emitirSonido();

        lola.comerHierba();
        lola.emitirSonido();

        Persona persona = new Persona();

        persona.comerAnimal(boby);
        persona.comerAnimal(michi);
        persona.comerAnimal(lola);
    }
}
