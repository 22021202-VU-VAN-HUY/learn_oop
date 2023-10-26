package week7;
//code by HuyVu
public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * constructor 1.
     */
    public Cylinder() {
    }

    /**
     * constructor 2.
     *
     * @param height height of cylinder
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * constructor 3.
     *
     * @param height height of cylinder
     * @param radius radius of cylinder
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * constructor 4.
     *
     * @param height height of cylinder
     * @param radius radius of cylinder
     * @param color  color of cylinder
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * get V of cylinder.
     *
     * @return V
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * get area cylinder.
     *
     * @return area
     */
    public double getArea() {
        return super.getArea() * 2 + 2 * PI * getRadius() * getHeight();
    }

    /**
     * override.
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Cylinder[ktra2.Circle[radius=" + getRadius() + ",color="
                + getColor() + "],height=" + getHeight() + "]";
    }
}
