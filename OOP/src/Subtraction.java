public class Subtraction extends BinaryExpression {
    /**
     * .
     *
     * @param left  .
     * @param right .
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
