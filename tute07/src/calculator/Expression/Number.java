package calculator.Expression;

/**
 * Leaf node
 */
public class Number implements Expression {
    private double number;

    public Number(double i) {
        this.number = i;
    }

    /**
     * @preconditions - none
     * @postconditions - returns number
     */
    public double compute() {
        return this.number;
    }
}
