package calculator.Expression;

/**
 * Leaf node
 */
public class Number implements Expression {
    private double value;

    public Number(double val) {
        this.value = val;
    }

    /**
     * @preconditions - none
     * @postconditions - returns number
     */
    public double compute() {
        return this.value;
    }
}
