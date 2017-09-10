package strategy;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class EveningGreetingStrategy implements GreetingStrategy {
    @Override
    public void greeting() {
        System.out.println("Good Evening~!");
    }
}
