package ke_thua.bai_tap.class_circle_and_class_cylinder;


public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height =" + height +
                ", volume = " + getVolume() +
                '}' + super.toString();
    }
}
