package adapter;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class FloatCalculatorAdapter implements Calculator {
    final DoubleCalculator doubleCalculator;

    public FloatCalculatorAdapter() {
        this.doubleCalculator = new DoubleCalculator();
    }

    @Override
    public Float add(Float a, Float b) {
        return (float) doubleCalculator.add(a.doubleValue(), b.doubleValue());
    }
}
