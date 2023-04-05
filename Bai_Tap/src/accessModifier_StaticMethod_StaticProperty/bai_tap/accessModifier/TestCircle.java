package accessModifier_StaticMethod_StaticProperty.bai_tap.accessModifier;

import accessModifier_StaticMethod_StaticProperty.bai_tap.accessModifier.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
    }
}

