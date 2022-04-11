package imprimible;

public class Main {
    public static void main(String[] args) {
        String[] habilidades = new String[]{"manejar", "caminar"};

        Curriculum cv = new Curriculum("Rodrigo", "Gomez", 28, habilidades);
        PDF miPdf = new PDF(200, "Roberto", "El mejor pdf", "Estudio");
        Informe informe = new Informe(5000, 300, "Autorazo", "Revisorazo");

        //Documento documento = new Documento();

        Impresora.imprimible(cv);
        Impresora.imprimible(miPdf);
        Impresora.imprimible(informe);
        //Impresora.imprimible(documento);
    }
}
