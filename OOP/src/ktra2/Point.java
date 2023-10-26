package ktra2;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * get distance.
     *
     * @param other point 2
     * @return distance
     */
    public double distance(Point other) {
        double dx = other.getPointX() - getPointX();
        double dy = other.getPointY() - getPointY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
