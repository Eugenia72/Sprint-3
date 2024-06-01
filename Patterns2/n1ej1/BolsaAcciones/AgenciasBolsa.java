package Patterns2.n1ej1.BolsaAcciones;


import Patterns2.n1ej1.Interfaces.Observer;
public class AgenciasBolsa implements Observer {
    private String name;

    public AgenciasBolsa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String acciones) {
        System.out.println(name + " ha sido notificada. Nueva actualización de acciones: " + acciones);
    }

    @Override
    public String toString() {
        return "AgenciasBolsa{" +
                "name='" + name + '\'' +
                '}';
    }
}
