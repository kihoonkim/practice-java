package factory_method.coffeeshop;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Americano implements Coffee {
    @Override
    public void drink() {
        System.out.println("아메리카노 마시기");
    }
}
