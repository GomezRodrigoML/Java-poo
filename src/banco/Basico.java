package banco;

public class Basico implements Saldo, Efectivo, Servicio {
    @Override
    public void transaccionOk() {
        System.out.println("Transaccion realizada con exito");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Transaccion fallida");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Tu saldo es....");
    }

    @Override
    public void retiroEfectivo() {
        System.out.println("retiraste tanto efectivo...");
    }

    @Override
    public void pagoServicio() {
        System.out.println("Pagaste tal servicio...");
    }
}
