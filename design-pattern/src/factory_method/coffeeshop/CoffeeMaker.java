package factory_method.coffeeshop;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public abstract class CoffeeMaker {
    public Coffee create() {

        requestCoffeeInfoFromDatabase();
        Coffee coffee = makeCoffee();
        createItemLog(coffee);

        return coffee;
    }

    abstract protected void requestCoffeeInfoFromDatabase();
    abstract protected void createItemLog(Coffee coffee);
    abstract protected Coffee makeCoffee();
}
