package accessmodifier_staticmethod_staticproperty.bai_tap.xay_dung_lop_ghi_trong_java;
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
