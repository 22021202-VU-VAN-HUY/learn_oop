package week8.dahinh2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * .
     */
    public void removeCircles() {
        List<Shape> remove = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                remove.add(shape);
            }
        }
        shapes.removeAll(remove);
    }

    /**
     * .
     *
     * @return f
     */
    public String getInfo() {
        String s = "";
        s += "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            s = s + shape.toString() + "\n";
        }
        return s;
    }

    /**
     * removeDuplicates.
     */
    public void removeDuplicates() {
        List<Shape> newList = new ArrayList<>();
        Set<Shape> set = new HashSet<>();
        for (Shape temp : shapes) {
            if (set.add(temp)) {
                newList.add(temp);
            }
        }
        shapes.clear();
        shapes.addAll(newList);
    }
}
