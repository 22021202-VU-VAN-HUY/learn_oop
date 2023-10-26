package ktra2;

class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * .
     * @param p1 .
     * @param p2 .
     * @param p3 .
     * @throws RuntimeException .
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double d12 = p1.distance(p2);
        double d13 = p1.distance(p3);
        double d23 = p2.distance(p3);
        if (d12 == 0 || d13 == 0 || d23 == 0) {
            throw new RuntimeException("it nhat 2 diem trung nhau");
        } else if (Math.abs(d12 - d13) == d23 || d23 == d12 + d13) {
            throw new RuntimeException("3 diem thang hang");
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /* public boolean checkTriangle() {
        double d12 = p1.distance(p2);
        double d13 = p1.distance(p3);
        double d23 = p2.distance(p3);

        if (d12 == 0 || d13 == 0 || d23 == 0) {
            return false;
        } else if (Math.abs(d12 - d13) == d23 || d23 == d12 + d13) {
            return false;
        }
        return true;
    }
     */

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public double getArea() {

        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }
    /*
    public double getArea(){
        double d12 = p1.distance(p2);
        double d13 = p1.distance(p3);
        double d23 = p2.distance(p3);
        double r = (d12+d13+d23)/2;
        return Math.sqrt(r*(r-d12)*(r-d13)*(r-d23));
    }
     */

    /**
     * .
     *
     * @return .
     */
    @Override
    public double getPerimeter() {
        double d12 = p1.distance(p2);
        double d13 = p1.distance(p3);
        double d23 = p2.distance(p3);
        return d12 + d13 + d23;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String getInfo() {
        String point1 = String.format("%.2f,%.2f", p1.getPointX(), p1.getPointY());
        String point2 = String.format("%.2f,%.2f", p2.getPointX(), p2.getPointY());
        String point3 = String.format("%.2f,%.2f", p3.getPointX(), p3.getPointY());
        return "ktra2.Triangle[(" + point1 + "),(" + point2 + "),(" + point3 + ")]";
    }
}
