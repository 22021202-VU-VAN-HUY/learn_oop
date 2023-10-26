package ktra2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point c1 = new Point(1, 1);
        Circle C1 = new Circle(c1, 1);

        Point c2 = new Point(2, 2);
        Circle C2 = new Circle(c1, 2);

        Point t11 = new Point(0, 3);
        Point t12 = new Point(4, 0);
        Point t13 = new Point(0, 0);
        Triangle t1 = new Triangle(t11, t12, t13);

        Point t21 = new Point(1, 1);
        Point t22 = new Point(2, 1);
        Point t23 = new Point(1, 2);
        Triangle t2 = new Triangle(t11, t12, t13);

        List<GeometricObject> s = new ArrayList<>();
        s.add(C1);
        s.add(t1);
        s.add(C2);
        s.add(t2);

        ShapeUtil shape = new ShapeUtil();
        shape.printInfo(s);
    }
}
