public class RationalCalculator extends AbstractCalculator{

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation mutliply, CalculationOperation devide){
        super(add, subtract, mutliply, devide);
    }
    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return devide.calc(a,b);
    }
}
