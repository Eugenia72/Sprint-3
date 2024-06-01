package Patterns2.n2ej1.MetodoPago;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void pagar(double importe) {
        System.out.println("Pago realizado con tarjeta de Credito " + importe);
    }
}
