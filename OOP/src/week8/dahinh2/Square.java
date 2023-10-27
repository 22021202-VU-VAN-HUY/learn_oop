package week8.dahinh2;

import java.util.Objects;

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

    /**
     * constructor 4.
     *
     * @param topLeft topLeft of square
     * @param side    side of square
     * @param color   color of square
     * @param filled  filled of square
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square s = (Square) o;
            boolean b = s.getSide() == getSide() && s.getTopLeft() == getTopLeft();
            return b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    /**
     * s.
     *
     * @return s.
     */
    public String toString() {
        return "week10.Square[topLeft=(" + super.topLeft.getPointX() + "," + super.topLeft.getPointY()
                + "),side=" + super.length + ",color=" + super.color
                + ",filled=" + super.filled + "]";
    }

}
