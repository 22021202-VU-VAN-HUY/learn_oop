public class Numeral extends Expression {
    private double value;

    /**
     * .
     */
    public Numeral() {
    }

    /**
     * .
     *
     * @param value .
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String toString() {
        int x = (int) this.value;
        return Integer.toString(x);
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public double evaluate() {
        return this.value;
    }
}
