package ThuchanhOOP.lap4.view;

import ThuchanhOOP.lap4.service.EmployeeService;

import java.util.Scanner;

public class Menu {
    EmployeeService employeeService = new EmployeeService();
    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Nhập nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Cập nhật thông tin nhân viên");
            System.out.println("5. Tìm kiếm nhân viên theo lương");
            System.out.println("6. Sắp xếp nhân viên theo họ tên");
            System.out.println("7. Sắp xếp nhân viên theo thu nhập");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    employeeService.inputEmployee(scanner);
                    break;
                case 2:
                    employeeService.displayEmployees();
                    break;
                case 3:
                    System.out.print("Nhập ID nhân viên muốn xóa: ");
                    int idToDelete = Integer.parseInt(scanner.nextLine());
                    employeeService.removeEmployee(idToDelete);
                    break;
                case 4:
                    System.out.print("Nhập ID nhân viên muốn cập nhật: ");
                    int idToUpdate = Integer.parseInt(scanner.nextLine());
                    employeeService.updateEmployee(idToUpdate, scanner);
                    break;
                case 5:
                    System.out.print("Nhập lương tối thiểu để tìm: ");
                    double minSalary = Double.parseDouble(scanner.nextLine());
                    employeeService.searchBySalary(minSalary);
                    break;
                case 6:
                    System.out.println("Chức năng đang update");
                    break;
                case 7:
                    System.out.println("Chức năng đang update");
                    break;
                case 8:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }



}
