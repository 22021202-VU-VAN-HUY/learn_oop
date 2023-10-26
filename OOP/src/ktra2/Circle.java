package ktra2;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
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

    /**
     * getArea.
     *
     * @return double
     */
    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * .
     *
     * @return double
     */
    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    /**
     * get info.
     *
     * @return String
     */
    @Override
    public String getInfo() {
        String point = String.format("%.2f,%.2f", center.getPointX(), center.getPointY());
        String r = String.format("%.2f", getRadius());
        return "ktra2.Circle[(" + point + "),r=" + r + "]";
    }
}
