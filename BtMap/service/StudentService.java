package BtMap.service;

import BtMap.entities.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentService {
    Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Scanner scanner) {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, age);
        studentMap.put(student.getId(), student);

        System.out.println("Thêm thành công sinh viên : " + student);
    }

    public void editStudent(Scanner scanner) {
        System.out.print("Enter student ID to edit: ");
        int id = Integer.parseInt(scanner.nextLine());

        Student student = studentMap.get(id);
        if (student != null) {
            System.out.print("Nhập tên mới: ");
            student.setName(scanner.nextLine());
            System.out.print("Nhập tuổi mới: ");
            student.setAge(Integer.parseInt(scanner.nextLine()));

            System.out.println("Đã chỉnh sửa thành công: " + student);
        } else {
            System.out.println("Sinh viên có ID  " + id + " không tồn tại");
        }
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (studentMap.remove(id) != null) {
            System.out.println("Sinh viên có ID" + id + " xóa thành công");
        } else {
            System.out.println("Sinh viên có ID " + id + " không tồn tại");
        }
    }


    public void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("Không có sinh viên nào");
        } else {
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }
}
