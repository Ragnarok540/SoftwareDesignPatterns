public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;

    private String observerState;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    public void update() {
        this.observerState = this.subject.getState();
    }

    public String getObserverState() {
        return this.observerState;
    }

}
