public abstract class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void useAlgorithm() {
    strategy.algorithm();
  } 

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

}
