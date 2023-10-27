package week10;

import week10.Expression;

public class Square extends Expression {
    private Expression expression;

    /**
     * .
     *
     * @param expression .
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
