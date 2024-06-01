package Patterns2.n2ej1;

import Patterns2.n2ej1.MetodoPago.MetodoPago;

public class PasarelaPagos {

    public void procesoPago(MetodoPago metodoPago, double importe) {
        metodoPago.pagar(importe);
    }
}

