package n2ej2;

import n2ej2.Interfaces.Agenda;
import n2ej2.Interfaces.Direccion;
import n2ej2.Interfaces.Telefono;
import n2ej2.Paises.Argentina.AgendaArgentina;
import n2ej2.Paises.Mexico.AgendaMexico;

public class App {
    private App() {
    }

    public static void runProgram() {
        Agenda fabricaArgentina = new AgendaArgentina();

        Agenda fabricaMexico = new AgendaMexico();

        Direccion direccionArgentina = fabricaArgentina.crearDireccion("Mendoza", "Carril Cervantes", 200, 02106);
        System.out.println("Direccion Argentina : " + direccionArgentina.getDireccionPais());
        Telefono telefonoArgentina = fabricaArgentina.crearTelefono("694754213");
        System.out.println("Tefono de Argentina: " + telefonoArgentina.getTelefonoPais());

        Direccion direccionMexico = fabricaMexico.crearDireccion("Jalisco", "Chabela", 93, 8576);
        System.out.println("Direccion Mexico: " + direccionMexico.getDireccionPais());
        Telefono telefonoMexico = fabricaMexico.crearTelefono("78574312");
        System.out.println("Tefono de Mexico: " + telefonoMexico.getTelefonoPais(
        ));
    }
}
