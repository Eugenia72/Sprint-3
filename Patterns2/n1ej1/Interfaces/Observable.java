package Patterns2.n1ej1.Interfaces;
import Patterns2.n1ej1.Interfaces.Observer;
public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void listObserver();
    void notifyObservers();
}