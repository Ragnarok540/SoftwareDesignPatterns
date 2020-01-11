public class Main {

    public static void main(String[] args) {

        Creator creatorA = new ConcreteCreatorA();
        creatorA.operation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.operation();

    }

}
