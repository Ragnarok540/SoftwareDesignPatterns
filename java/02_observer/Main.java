public class Main {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        subject.addObserver(observer1);

        ConcreteObserver observer2 = new ConcreteObserver(subject);
        subject.addObserver(observer2);

        subject.setState("State A");
        subject.notifyObservers();

        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());

        subject.deleteObserver(observer2);

        subject.setState("State B");
        subject.notifyObservers();

        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());

    }

}
