package n3ej1.Vehiculo;

public class Barco implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Barco zarpando");
    }

    @Override
    public void parar() {
        System.out.println("Barco atracando");
    }

    @Override
    public void acelerar() {
        System.out.println("Barco acelerando");
    }

}