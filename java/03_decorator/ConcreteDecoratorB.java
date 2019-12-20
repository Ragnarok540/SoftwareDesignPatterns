public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
        System.out.println("Concrete Decorator B Created");
    }

    public void operation() {
        super.operation();
        System.out.println("Decorator B Operation");
    }

}
