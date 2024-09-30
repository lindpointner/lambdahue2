public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation devide){
        super(add, subtract, multiply, devide);
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
        return new Number(a.getA()*b.getA()-a.getB()*b.getB(), a.getA()*b.getA() + a.getB()*b.getB());
    }

    @Override
    public Number divide(Number a, Number b) {
        return new Number((a.getA() * b.getA() + a.getB() * b.getB())/b.getA() * b.getA() + b.getB() * b.getB(), (a.getB() * b.getA() - a.getA() * b.getB()) / b.getA() * b.getA() + b.getB() * b.getB());
    }
}
