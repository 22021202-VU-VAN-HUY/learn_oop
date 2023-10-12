package week8.dahinh1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * constructor 1.
     */
    public Shape() {
    }

    /**
     * constructor2.
     *
     * @param color  color
     * @param filled filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * toString of shape.
     *
     * @return string
     */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }

    ;
}
