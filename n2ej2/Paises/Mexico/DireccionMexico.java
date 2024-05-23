package n2ej2.Paises.Mexico;
import n2ej2.Interfaces.Direccion;

public class DireccionMexico implements Direccion {

    private final static String PAIS = "Mexico";
    private String calle;
    private int numero;
    private String ciudad;
    private int codigoPostal;

    public DireccionMexico(String calle, int numero, String ciudad, int codigoPostal) {

        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String getDireccionPais() {
        return calle + " " + numero + " " + ciudad + " " + codigoPostal + " " + PAIS;
    }
}





