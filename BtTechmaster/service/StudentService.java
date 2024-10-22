package Ontap.buoi9.bai1.service;

import Ontap.buoi9.bai1.entities.Student;
import Ontap.buoi9.bai1.entities.Techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    ArrayList<Student>students=new ArrayList<>();
    public Student inputInfo(Scanner scanner){
        System.out.println("-----Nhập thông tin sinh viên-----");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập học lực ");
        String academicability = scanner.nextLine();

        Student student = new Student(name, age, academicability);
        return student;

    }

    public void updateStudent(Scanner scanner, Techmaster techmaster){
        System.out.println("Nhập ID học viên cần chỉnh sửa học lực: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkExisted=false;
        for (Student st: techmaster.getClassroom().getStudents()){ //tìm học viên cần sửa
            if(st.getId() == id){
                checkExisted=true;
                System.out.println("Mời bạn nhập lại học lực");
                String classify = scanner.nextLine();
                st.setAcademicability(classify); //sửa học lực
                break;
            }
        }
        if(!checkExisted){
            System.out.println("Không tìm thấy học viên có id: "+id);
        }
    }

    public void removeStudent(Scanner scanner, Techmaster techmaster){
        //Student studentremove = null; //C2: Biến để lưu học viên cần xóa
        System.out.println("Nhập ID học viên cần xóa: ");
        int iddele = Integer.parseInt(scanner.nextLine());
        boolean checkExisteddele=false;
        for (Student st1: techmaster.getClassroom().getStudents()){ //tìm học viên cần xóa
            if(st1.getId() == iddele){
                checkExisteddele=true;
                //studentremove=st1; //C2: lưu học viên cần xóa
                techmaster.getClassroom().getStudents().remove(st1);
                System.out.println("Đã xoá thành công học viên: "+st1);
                break;
            }
        }
        if(!checkExisteddele){
            System.out.println("Không tìm thấy học viên có id: "+iddele);
        }
    }
}
