package calculator.Expression;

/**
 * Composite
 */
public class AdditionExpression implements Expression {
    private Expression left;
    private Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double compute() {
        return this.left.compute() + this.right.compute();
    }
}
