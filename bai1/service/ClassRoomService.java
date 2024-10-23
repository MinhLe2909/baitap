package Ontap.buoi9.bai1.service;

import Ontap.buoi9.bai1.entities.Classroom;
import Ontap.buoi9.bai1.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomService {
    public Classroom inputInfo(Scanner scanner){
        System.out.println("Nhập môn học: ");
        String subject = scanner.nextLine();
        System.out.println("Nhập thông tin của học viên ");

       StudentService studentService = new StudentService();
        ArrayList<Student>students=new ArrayList<>();
        while (true){
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("Bạn có muốn tạo tiếp học viên ko");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")){
                break;
            }
        }
        Classroom classroom = new Classroom(subject,students);
        return classroom;

    }

}
