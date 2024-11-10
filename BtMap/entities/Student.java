package BtMap.entities;

public class Student {
    private static int idcount=0;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.id = ++idcount;
        this.name = name;
        this.age = age;
    }

    public static int getIdcount() {
        return idcount;
    }

    public static void setIdcount(int idcount) {
        Student.idcount = idcount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
