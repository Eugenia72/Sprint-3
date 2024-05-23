package n2ej2.Paises.Mexico;

import n2ej2.Interfaces.Telefono;

public class TelefonoMexico implements Telefono {
    private String telefono;
    private static final String PREFIJO = "+52";

    public TelefonoMexico(String telefono) {
       this.telefono = telefono;
    }

    @Override
    public String getTelefonoPais() {

        return PREFIJO + " " + telefono;
    }
}

