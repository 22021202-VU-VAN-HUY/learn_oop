public class Division extends BinaryExpression {
    /**
     * .
     *
     * @param left  .
     * @param right .
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("error by divide 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
