package week10;

public class ExpressionTest {
    /**
     * .
     *
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
    /*
    public static void main(String[] args) {

        week10.Expression expression = new week10.Square(
                new week10.Addition(
                        new week10.Addition(
                                new week10.Square(new week10.Numeral(10)),
                                new week10.Numeral(-3)
                        ),
                        new week10.Division(
                                new week10.Numeral(4),
                                new week10.Numeral(0)
                        )
                )
        );

        System.out.println("Biểu thức: " + expression.toString());
        System.out.println("Kết quả: " + expression.evaluate());
    }


     */
}
