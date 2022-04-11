package poo_P2;

public class Perecedero extends Producto {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double finalPrice = super.calcular(cantidadDeProductos);

        switch (diasPorCaducar) {
            case 1:
                finalPrice = finalPrice / 4;
                break;
            case 2:
                finalPrice = finalPrice / 3;
                break;
            case 3:
                finalPrice = finalPrice / 2;
                break;
        }

        return finalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "diasPorCaducar=" + diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }
}
