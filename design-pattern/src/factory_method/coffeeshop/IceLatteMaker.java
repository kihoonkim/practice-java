package factory_method.coffeeshop;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class IceLatteMaker extends CoffeeMaker {
    @Override
    protected void requestCoffeeInfoFromDatabase() {
        System.out.println("아이스라떼 제조법 알려줘");
    }

    @Override
    protected void createItemLog(Coffee coffee) {
        System.out.println("아이스라떼 한잔 만들었어");
    }

    @Override
    protected Coffee makeCoffee() {
        return new IceLatte();
    }
}
