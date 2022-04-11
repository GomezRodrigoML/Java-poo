package imprimible;

import java.util.Arrays;

public class Curriculum extends Documento {
    private String name;
    private String surname;
    private int edad;
    private String[] habilidades;

    public Curriculum(String name, String surname, int edad, String[] habilidades) {
        this.name = name;
        this.surname = surname;
        this.edad = edad;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", edad=" + edad +
                ", habilidades=" + Arrays.toString(habilidades);
    }
}
