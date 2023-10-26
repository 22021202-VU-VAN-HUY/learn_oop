package ktra2;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

    /**
     * .
     *
     * @param shapes .
     * @return .
     */
    public String printInfo(List<GeometricObject> shapes) {
        String result = "ktra2.Circle:";
        List<GeometricObject> triangle = new ArrayList<>();
        for (GeometricObject g : shapes) {
            if (g instanceof Circle) {
                result = result + "\n" + g.getInfo();
            } else {
                triangle.add(g);
            }
        }

        result = result + "\n" + "ktra2.Triangle:";
        for (GeometricObject g : triangle) {
            if (g instanceof Triangle) {
                result = result + "\n" + g.getInfo();
            }
        }
        return result;
    }
}
