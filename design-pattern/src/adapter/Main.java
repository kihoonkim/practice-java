package adapter;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Main {
    public static void main(String[] args) {
        // 알고리즘을 요구사항에 맞게 수정하여 사용
        FloatCalculatorAdapter adapter = new FloatCalculatorAdapter();

        System.out.println(adapter.add(1.1f, 2.2f));
    }
}
