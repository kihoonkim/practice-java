package strategy;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Client {
    private GreetingStrategy strategy;

    public void setStrategy(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sayHello() {
        strategy.greeting();
    }
}
