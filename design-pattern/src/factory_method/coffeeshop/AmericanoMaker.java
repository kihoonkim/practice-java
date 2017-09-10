package factory_method.coffeeshop;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class AmericanoMaker extends CoffeeMaker {
    @Override
    protected void requestCoffeeInfoFromDatabase() {
        System.out.println("아메리카노 제조법 알려줘");
    }

    @Override
    protected void createItemLog(Coffee coffee) {
        System.out.println("아메리카노 한잔 만들었어");
    }

    @Override
    protected Coffee makeCoffee() {
        return new Americano();
    }
}
