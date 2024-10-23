package Ontap.buoi9.bai1.entities;

public class Techmaster {
    private String management;
    private String lecturer;
    private Classroom classroom;

    public Techmaster(String management, String lecturer, Classroom classroom) {
        this.management = management;
        this.lecturer = lecturer;
        this.classroom = classroom;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "management='" + management + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
