public class ExpressionTest {
    /**
     * .
     * @param args .
     */
    public static void main(String[] args) {
        Expression expression = new Square(
                new Addition(
                        new Addition(
                                new Square(new Numeral(10)),
                                new Numeral(-3)
                        ),
                        new Multiplication(
                                new Numeral(4),
                                new Numeral(3)
                        )
                )
        );

        System.out.println("Biểu thức: " + expression.toString());
        System.out.println("Kết quả: " + expression.evaluate());
    }
}
