package edu.sdsu.cs160l.calculator;

public class DoubleCalculator implements Calculator<Double> {
    @Override
    public <T extends Number> T add(T a, T b) {
        return (T) (Double) ((Double) a + (Double) b);
    }

    @Override
    public <T extends Number> T sub(T a, T b) {
        return (T) (Double) ((Double) a - (Double) b);
    }

    @Override
    public <T extends Number> T div(T a, T b) throws ArithmeticException {
        try {
            return (T) (Double) ((Double) a / (Double) b);
        }
        catch (ArithmeticException e) {
            return (T) (Double) Double.POSITIVE_INFINITY;
        }
    }

    @Override
    public <T extends Number> T mul(T a, T b) {
        return (T)(Double) ((Double) a * (Double) b);
    }
}
