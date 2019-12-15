public class Main {

    public static void main(String[] args) {

        Context context1 = new ConcreteContext1();
        context1.useAlgorithm();

        Context context2 = new ConcreteContext2();
        context2.useAlgorithm();

        context2.setStrategy(new ConcreteStrategyA());
        context2.useAlgorithm();

    }

}
