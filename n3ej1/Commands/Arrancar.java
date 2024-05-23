package n3ej1.Commands;

import n3ej1.Vehiculo.Vehiculo;

public class Arrancar implements Command {
    private Vehiculo vehiculo;

    public Arrancar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.arrancar();
    }
}

