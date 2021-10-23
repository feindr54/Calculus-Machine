package Differentiation;

public class Trigonometry implements Expressions {
    String type; // denotes sin, cos, tan, sec, csc and cot
    int coefficient;
    String input;

    public Trigonometry(String type, int coefficient, String input) {
        this.type = type;
        this.coefficient = coefficient;
        this.input = input;
    }

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
