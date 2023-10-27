package week8.dahinh1;

public class Square extends Rectangle {
    /**
     * constructor 1.
     */
    public Square() {
    }

    /**
     * constructor 2.
     *
     * @param side side of square
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * constructor 3.
     *
     * @param side   side of square
     * @param color  color of square
     * @param filled filled of square
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    public void setWidth(double side) {
        super.length = side;
        super.width = side;
    }

    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }

    /**
     * s.
     *
     * @return s.
     */
    public String toString() {
        return "week10.Square[side=" + super.length
                + ",color=" + super.color
                + ",filled=" + super.filled + "]";
    }

}
