public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
        System.out.println("Concrete Decorator A Created");
    }

    public void operation() {
        super.operation();
        System.out.println("Decorator A Operation");
    }

}
