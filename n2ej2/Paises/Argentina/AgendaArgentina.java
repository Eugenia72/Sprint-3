package n2ej2.Paises.Argentina;

import n2ej2.Interfaces.Agenda;
import n2ej2.Interfaces.Direccion;
import n2ej2.Interfaces.Telefono;

public class AgendaArgentina implements Agenda {
    @Override
    public Direccion crearDireccion(String ciudad, String calle, int numero, int codigoPostal) {
        return new DireccionArgentina(calle, numero, ciudad, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String telefono) {
        return  new TelefonoArgentina(telefono);
    }
}
