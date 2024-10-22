package Ontap.buoi9.bai1.view;

import Ontap.buoi9.bai1.entities.Student;
import Ontap.buoi9.bai1.entities.Techmaster;
import Ontap.buoi9.bai1.service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu(Scanner scanner, Techmaster techmaster){
        System.out.println("1. Hiển thị thông tin trung tâm ");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Cập nhật học lực ");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Thoát");
        System.out.println("Mời bạn chọn");
        selectMenu(scanner, techmaster);

    }
    public void selectMenu(Scanner scanner, Techmaster techmaster){
        int choose = Integer.parseInt(scanner.nextLine());
        switch(choose){
            case 1:
                //todo Hiển thị thông tin của trung tâm
                System.out.println(techmaster);
                break;
            case 2:
                //todo thêm học viên
                Student student = studentService.inputInfo(scanner);
                techmaster.getClassroom().getStudents().add(student);
                break;
            case 3:
                //todo update học viên
                studentService.updateStudent(scanner, techmaster);
                break;
            case 4:
                //todo delete
                studentService.removeStudent(scanner, techmaster);
                break;
            default:
                System.exit(0);
        }



    }


}
