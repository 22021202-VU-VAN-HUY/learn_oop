package week8.dahinh2;

import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * constructor 1.
     */
    public Rectangle() {
    }

    /**
     * constructor 2.
     *
     * @param width  width of rectangle
     * @param length length of rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor 3.
     *
     * @param width  width of rectangle
     * @param length length of rectangle
     * @param color  color of rectangle
     * @param filled filled of rectangle
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * constructor 4.
     *
     * @param topLeft ktra2.Point topLeft
     * @param width   width of rectangle
     * @param length  length of rectangle
     * @param color   color of rectangle
     * @param filled  filled of rectangle
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getWidth() + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0
                && Double.compare(length, rectangle.length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=(" + topLeft.getPointX() + "," + topLeft.getPointY()
                + "),width=" + this.getWidth()
                + ",length=" + this.getLength()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
