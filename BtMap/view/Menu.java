package BtMap.view;

import BtMap.service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();

    public void displayMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("---- MENU----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị thông tin sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentService.addStudent(scanner);
                    break;
                case 2:
                    studentService.editStudent(scanner);
                    break;
                case 3:
                    studentService.deleteStudent(scanner);
                    break;
                case 4:
                    studentService.displayStudents();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 0);
    }
}
