package week8.dahinh2;

import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
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

    /**
     * constructor 4.
     *
     * @param center center of circle
     * @param radius radius of circle
     * @param color  color of circle
     * @param filled filled of circle
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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
        return "ktra2.Circle[center=(" + center.getPointX() + "," + center.getPointY()
                + "),radius=" + this.radius
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0
                && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
