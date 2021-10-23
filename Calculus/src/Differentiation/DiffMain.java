package Differentiation;

public class DiffMain {
    int value;
    String statement;

    public DiffMain(int value, String statement) {
        this.value = value;
        this.statement = statement;
    }

    //parse the value of a single polynomial
    // the left should be integers that denote coefficients
    //the right should include ^ and integers
    //
    public void parsePoly(String statement) {
        String[] parsedR1 = statement.split("[x^]");
        int coefficient, exponent;
        try {
            coefficient = Integer.parseInt(parsedR1[0]);
            exponent = Integer.parseInt(parsedR1[1]);
        } catch (NumberFormatException e) {
            throw e;
        }

    }

    public static void main(String[] args) {
        // input equation, and the subbed in value
        Polynomial p = new Polynomial(1, 0.5);
        System.out.println(p.differential(1));
    }
}
