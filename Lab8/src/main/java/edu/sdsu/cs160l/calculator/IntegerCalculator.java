package edu.sdsu.cs160l.calculator;

public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public <T extends Number> T add(T a, T b) {
        return (T) (Integer) ((Integer) a + (Integer) b);
    }

    @Override
    public <T extends Number> T sub(T a, T b) {
        return (T) (Integer) ((Integer) a - (Integer) b);
    }

    @Override
    public <T extends Number> T div(T a, T b) throws ArithmeticException {
        try {
            return (T) (Integer) ((Integer) a / (Integer) b);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
            throw new ArithmeticException();
        }
    }

    @Override
    public <T extends Number> T mul(T a, T b) {
        return (T)(Integer) ((Integer) a * (Integer) b);
    }
}
