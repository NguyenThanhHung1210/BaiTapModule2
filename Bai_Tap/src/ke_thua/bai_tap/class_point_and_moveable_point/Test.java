package ke_thua.bai_tap.class_point_and_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(3, 3);
        System.out.println("Point: " + p.toString());

        MoveablePoint mPoint = new MoveablePoint(10, 10, 5, 5);
        System.out.println("Movable Point (before): " + mPoint.toString());
        mPoint.move();
        System.out.println("Movable Point (after): " + mPoint.toString());
    }
}
