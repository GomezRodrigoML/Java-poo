package imprimible;

//texto de n longitud, cantidad de páginas, autor, y revisor.
public class Informe extends Documento {
    private int texto;
    private int paginas;
    private String autor;
    private String revisor;

    public Informe(int texto, int paginas, String autor, String revisor) {
        this.texto = texto;
        this.paginas = paginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informe " +
                "texto=" + texto +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'';
    }
}
