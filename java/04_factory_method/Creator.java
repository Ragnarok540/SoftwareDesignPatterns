public abstract class Creator {

    public void operation() {
        Product product = factoryMethod();
        product.printName();
    } 

    public abstract Product factoryMethod();

}
