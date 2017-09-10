package factory_method.coffeeshop;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class IceLatte implements Coffee {
    @Override
    public void drink() {
        System.out.println("아이스 라떼 마시기");
    }
}
