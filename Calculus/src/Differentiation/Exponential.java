package Differentiation;

public class Exponential implements Expressions {
    String exponent;
    double base;

    @Override
    public double lowerBound(double value) {
        return 0;
    }

    @Override
    public double upperBound(double value) {
        return 0;
    }

    @Override
    public double differential(double value) {
        return 0;
    }

    @Override
    public double integral(double value) {
        return 0;
    }
}
