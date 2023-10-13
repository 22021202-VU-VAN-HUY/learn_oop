package week7;

public class Circle {

    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * constructor 1.
     */
    public Circle() {
    }

    /**
     * constructor 2.
     *
     * @param radius ban kinh duong tron
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor 3.
     *
     * @param radius ban kinh duong tron
     * @param color  mau sac hinh tron
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + getRadius() + ",color=" + getColor() + "]";
    }
}
