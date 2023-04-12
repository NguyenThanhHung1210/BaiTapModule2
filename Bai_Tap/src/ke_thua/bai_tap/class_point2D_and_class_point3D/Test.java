package ke_thua.bai_tap.class_point2D_and_class_point3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(8, 9);
        System.out.println("Before 2D: " + point2D.toString());
        point2D.setXY(11, 19);
        System.out.println("After 2D: " + Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(7, 8, 9);
        System.out.println("Before 3D: " + point3D.toString());
        point3D.setXYZ(9, 10, 11);
        System.out.println("After 3D: " + Arrays.toString(point3D.getXYZ()));
    }
}
