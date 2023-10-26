package week8.dahinh1;

public class Circle extends Shape {
    protected double radius;

    /**
     * constructor 1.
     */
    public Circle() {
    }

    /**
     * constructor 2.
     *
     * @param radius radius of circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor 3.
     *
     * @param radius radius of circle
     * @param color  color of circle
     * @param filled filled of circle
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "ktra2.Circle[radius=" + this.radius + ",color="
                + super.getColor() + ",filled="
                + super.isFilled() + "]";
    }
}
