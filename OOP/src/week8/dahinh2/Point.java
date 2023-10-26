package week8.dahinh2;

import java.util.Objects;

class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     *
     * @param newpoint point
     * @return double
     */
    public double distance(Point newpoint) {
        double x = Math.abs(this.pointX - newpoint.pointX);
        double y = Math.abs(this.pointY - newpoint.pointY);
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(pointX, point.pointX) == 0
                && Double.compare(pointY, point.pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}
