package n2ej2.Paises.Mexico;

import n2ej2.Interfaces.Agenda;
import n2ej2.Interfaces.Direccion;
import n2ej2.Interfaces.Telefono;


public class AgendaMexico implements Agenda {

    @Override
    public Direccion crearDireccion(String ciudad, String calle, int numero, int codigoPostal) {
        return new DireccionMexico(calle, numero, ciudad, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String telefono) {
        return new TelefonoMexico(telefono);
    }

}