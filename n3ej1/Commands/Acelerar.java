package n3ej1.Commands;
import n3ej1.Vehiculo.Vehiculo;
public class Acelerar implements Command {

        private Vehiculo vehiculo;

    public Acelerar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
        public void execute() {
            vehiculo.acelerar();
    }
}
