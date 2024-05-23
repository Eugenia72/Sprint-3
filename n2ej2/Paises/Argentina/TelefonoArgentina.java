package n2ej2.Paises.Argentina;
import n2ej2.Interfaces.Telefono;

public class TelefonoArgentina implements Telefono {
    private String telefono;
    private static final String PREFIJO = "+54";

    public TelefonoArgentina(String telefono) {
        this.telefono = telefono;
    }



    @Override
    public String getTelefonoPais() {

        return PREFIJO + " " + telefono;
    }

}


