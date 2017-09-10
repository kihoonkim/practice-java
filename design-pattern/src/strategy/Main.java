package strategy;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Main {
    public static void main(String[] args) {
        // Strategy Pattern
        // 선언과 기능 분리
        // 알고리즘의 추상적인 접근점을 만들고 알고리즘 교환가능

        Client client = new Client();

        client.setStrategy(new MorningGreetingStrategy());
        client.sayHello();

        client.setStrategy(new AfternoonGreetingStrategy());
        client.sayHello();

        client.setStrategy(new EveningGreetingStrategy());
        client.sayHello();
    }
}
