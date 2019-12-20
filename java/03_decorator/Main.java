public class Main {

    public static void main(String[] args) {

        ConcreteComponent component = new ConcreteComponent();
        component.operation();

        ConcreteDecoratorA cda = new ConcreteDecoratorA(component);
        cda.operation();

        ConcreteDecoratorB cdb = new ConcreteDecoratorB(cda);
        cdb.operation();

        ConcreteDecoratorA cdc = new ConcreteDecoratorA(cdb);
        cdc.operation();

    }

}
