package accessmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class Circle {

        private final double PI = 3.14;
        private double radius = 1.0;
        private String color = "red";

        public Circle() {

        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return Math.pow(this.radius, 2) * PI;
        }


    }
