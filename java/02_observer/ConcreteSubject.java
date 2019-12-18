import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;

    private String state;

    public ConcreteSubject() {
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
