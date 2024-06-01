package Patterns2.n2ej1;

import Patterns2.n2ej1.MetodoPago.MetodoPago;



public class TiendaZapatos {


        private PasarelaPagos pasarelaPagos;

        public TiendaZapatos(PasarelaPagos pasarelaPagos) {
            this.pasarelaPagos = pasarelaPagos;
        }

        public void comprarZapatos(double precio, MetodoPago metodoPago) {

            pasarelaPagos.procesoPago(metodoPago, precio);
        }

    }

