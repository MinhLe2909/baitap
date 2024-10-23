package Ontap.buoi9.bai1.entities;

public class Student {
    private static int idcounter=0;
    private int id;
    private String name;
    private int age;
    private String academicability;

    public Student(String name, int age, String academicability ) {
        this.id = ++idcounter;
        this.name = name;
        this.age = age;
        this.academicability = academicability;
    }

    public static int getIdcounter() {
        return idcounter;
    }

    public static void setIdcounter(int idcounter) {
        Student.idcounter = idcounter;
    }

    public String getAcademicability() {
        return academicability;
    }

    public void setAcademicability(String academicability) {
        this.academicability = academicability;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", academicability='" + academicability + '\'' +
                '}';
    }
}
