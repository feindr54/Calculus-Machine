package Differentiation;

public class Polynomial implements Expressions {
    double coefficient;
    double exponent;

    public Polynomial(double coefficient, double exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    @Override
    public double lowerBound(double value) {
        return coefficient * Math.pow((value - 0.000000001), exponent);
    }

    @Override
    public double upperBound(double value) {
        return coefficient * Math.pow((value + 0.000000001), exponent);
    }

    @Override
    public double differential(double value) {
        double differential = (upperBound(value) - lowerBound(value)) / 0.000000002;
        if (Math.abs(Math.round(differential) - differential) < 0.000001) {
            return Math.round(differential);
        }
        return differential;
    }

    @Override
    public double integral(double value) {
        return 0;
    }
}
