package n3ej1.Vehiculo;

public class Avion implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("Despegando avion");
    }

    @Override
    public void parar() {
        System.out.println("Aterrizando avion");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando avion");
    }
}
