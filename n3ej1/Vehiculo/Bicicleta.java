package n3ej1.Vehiculo;

public class Bicicleta implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando bicicleta");
    }

    @Override
    public void parar() {
        System.out.println("Parando bicicleta");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta");
    }
}
