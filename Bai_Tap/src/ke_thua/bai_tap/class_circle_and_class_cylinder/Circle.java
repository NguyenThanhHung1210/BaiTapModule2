package ke_thua.bai_tap.class_circle_and_class_cylinder;


public class Circle {
    private final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
    }

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
        return Math.pow(radius, 2) * PI;
    }

    @Override
    public String toString() {
        return "\tCircle{" +
                "radius =" + radius +
                ", color ='" + color + '\'' +
                '}';
    }
}
