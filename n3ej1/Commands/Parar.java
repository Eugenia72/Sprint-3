package n3ej1.Commands;
import n3ej1.Vehiculo.Vehiculo;

public class Parar implements Command{

    private Vehiculo vehiculo;

    public Parar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.parar();
    }
}
