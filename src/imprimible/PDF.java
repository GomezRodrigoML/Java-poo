package imprimible;

//Incluyen atributos como cantidad de páginas, nombre del autor, título y género.
public class PDF extends Documento {
    private int paginas;
    private String autor;
    private String titulo;
    private String genero;

    public PDF(int paginas, String autor, String titulo, String genero) {
        this.paginas = paginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PDF" +
                "paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'';
    }
}
