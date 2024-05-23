package n3ej1.Vehiculo;

public class Coche implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando coche");
    }

    @Override
    public void parar() {
        System.out.println("Parando coche");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando coche");
    }
}

