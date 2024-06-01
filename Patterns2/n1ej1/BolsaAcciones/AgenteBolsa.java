package Patterns2.n1ej1.BolsaAcciones;

import Patterns2.n1ej1.Interfaces.Observable;
import Patterns2.n1ej1.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa implements Observable {
    private final List<Observer> agencias = new ArrayList<>();
    private String acciones;

    public AgenteBolsa(String acciones) {
        this.acciones = acciones;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        agencias.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        agencias.remove(observer);
        System.out.println("La agencia " + observer.getName() + " ha sido eliminada.");
    }

    @Override
    public void listObserver() {
        agencias.forEach(System.out::println);
    }

    @Override
    public void notifyObservers() {
        for (Observer agencia : agencias) {
            agencia.update(acciones);
        }
    }
}