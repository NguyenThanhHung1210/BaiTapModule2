package accessModifier_StaticMethod_StaticProperty.bai_tap.xayDungLopGhiTrongJava;
public class Student {
    private String name = "John";
    private String classes = "A12";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name ='" + name + '\'' +
                ", classes ='" + classes + '\'' +
                '}';
    }
}
