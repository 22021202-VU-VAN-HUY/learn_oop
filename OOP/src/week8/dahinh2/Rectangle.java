package week8.dahinh2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

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

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getWidth() + this.getLength());
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + this.getWidth()
                + ",length=" + this.getLength()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
