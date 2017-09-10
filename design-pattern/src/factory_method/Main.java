package factory_method;

import factory_method.coffeeshop.AmericanoMaker;
import factory_method.coffeeshop.Coffee;
import factory_method.coffeeshop.CoffeeMaker;
import factory_method.coffeeshop.IceLatteMaker;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Main {
    public static void main(String[] args) {
        // 구조와 구현의 분리
        CoffeeMaker maker;

        maker = new IceLatteMaker();
        Coffee coffee = maker.create();
        coffee.drink();

        maker = new AmericanoMaker();
        Coffee coffee1 = maker.create();
        coffee1.drink();
    }
}
