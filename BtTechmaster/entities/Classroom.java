package Ontap.buoi9.bai1.entities;

import java.util.ArrayList;

public class Classroom {
    private String subject;
    private ArrayList<Student>students;

    public Classroom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
