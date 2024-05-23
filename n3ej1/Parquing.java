package n3ej1;

import n3ej1.Commands.Command;
import n3ej1.Vehiculo.Bicicleta;
import n3ej1.Vehiculo.Coche;
import n3ej1.Vehiculo.Vehiculo;
import n3ej1.Vehiculo.Barco;
import n3ej1.Vehiculo.Avion;
import n3ej1.Commands.Arrancar;
import n3ej1.Commands.Acelerar;
import n3ej1.Commands.Parar;

public class Parquing {

    private Parquing() {
    }

    public static void run() {

        Vehiculo bicicleta = new Bicicleta();
        Vehiculo coche = new Coche();
        Vehiculo avion = new Avion();
        Vehiculo barco = new Barco();

        Command arrancarBicicleta = new Arrancar(bicicleta);
        Command acelerarBicicleta = new Acelerar(bicicleta);
        Command pararBicicleta = new Parar(bicicleta);

        Command arrancarCoche = new Arrancar(coche);
        Command acelerarCoche = new Acelerar(coche);
        Command pararCoche = new Parar(coche);

        Command arrancarAvion = new Arrancar(avion);
        Command acelerarAvion = new Acelerar(avion);
        Command pararAvion = new Parar(avion);

        Command arrancarBarco = new Arrancar(barco);
        Command acelerarBarco = new Acelerar(barco);
        Command pararBarco = new Parar(barco);

        arrancarBicicleta.execute();
        pararBicicleta.execute();
        acelerarBicicleta.execute();

        System.out.println();

        arrancarCoche.execute();
        acelerarCoche.execute();
        pararCoche.execute();

        System.out.println();

        arrancarAvion.execute();
        acelerarAvion.execute();
        pararAvion.execute();

        System.out.println();

        arrancarBarco.execute();
        acelerarBarco.execute();
        pararBarco.execute();

    }

}

