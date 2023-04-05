package accessModifier_StaticMethod_StaticProperty.bai_tap.xayDungLopGhiTrongJava;

import accessModifier_StaticMethod_StaticProperty.bai_tap.xayDungLopGhiTrongJava.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hung");
        student.setClasses("A12");
        System.out.println(student);
    }
}