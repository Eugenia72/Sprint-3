package Patterns2.n2ej1;
import Patterns2.n2ej1.MetodoPago.*;
public class Main {

    public static void main(String[] args) {

        PasarelaPagos pasarelaPagos = new PasarelaPagos();

        TiendaZapatos Grimaldi = new TiendaZapatos(pasarelaPagos);

        MetodoPago tarjetaCredito = new TarjetaCredito();
        Grimaldi.comprarZapatos(100.0, tarjetaCredito);

        MetodoPago transferencia = new Transferencia();
        Grimaldi.comprarZapatos(125, transferencia);


    }
}