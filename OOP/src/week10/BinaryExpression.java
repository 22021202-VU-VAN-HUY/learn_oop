package week10;

abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /*@Override
    public String toString() {
        return null;
    }

    @Override
    public double evaluate() {
        return 0;
    }

     */
}
