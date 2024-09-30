public class VectorCalculator extends AbstractCalculator{
    public VectorCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation devide){
        super(add, substract, multiply, devide);

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
        return new Number(a.getA()*b.getA() - a.getB() * a.getB(),0);
    }

    @Override
    public Number divide(Number a, Number b) {
        return new Number(a.getA()*b.getA() + a.getB()*b.getB(),0);
    }
}
