package ThuchanhOOP.lap4.service;

import ThuchanhOOP.lap4.entities.Employee;
import ThuchanhOOP.lap4.entities.Leader;
import ThuchanhOOP.lap4.entities.SaleEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    ArrayList<Employee> employees = new ArrayList<>();

    public void inputEmployee(Scanner scanner) {
        System.out.println("1. Nhân viên hành chính");
        System.out.println("2. Nhân viên tiếp thị");
        System.out.println("3. Trưởng phòng");
        System.out.print("Chọn loại nhân viên: ");
        int chosse = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập lương: ");
        double salary = Double.parseDouble(scanner.nextLine());

        switch (chosse) {
            case 1:
                addEmployee(new Employee(name, salary));
                break;
            case 2:
                System.out.print("Nhập doanh số bán hàng: ");
                double salesVolume = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập tỉ lệ hoa hồng: ");
                double commissionRate = Double.parseDouble(scanner.nextLine());
                addEmployee(new SaleEmployee(name, salary, salesVolume, commissionRate));
                break;
            case 3:
                System.out.print("Nhập lương trách nhiệm: ");
                double salaryResp = Double.parseDouble(scanner.nextLine());
                addEmployee(new Leader(name, salary, salaryResp));
                break;
            default:
                System.out.println("Loại nhân viên không hợp lệ!");
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    //Xóa nhân viên
    public void removeEmployee(int id) {
        Employee employeeToRemove = null;

        // Tìm nhân viên có ID cần xóa
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employeeToRemove = emp;
                break;
            }
        }

        // Xóa nhân viên nếu tìm thấy
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Nhân viên với ID " + id + " đã được xóa.");
        } else {
            System.out.println("Không tìm thấy nhân viên với ID " + id);
        }
    }


    //Update thông tin nhân viên
    public void updateEmployee(int id, Scanner scanner) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Nhập tên mới: ");
                String newName = scanner.nextLine();
                System.out.println("Nhập lương mới: ");
                double newSalary = Double.parseDouble(scanner.nextLine());

                // Cập nhật thông tin
                emp.setName(newName);
                emp.setSalary(newSalary);

                System.out.println("Cập nhật thành công!");
                return;


            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }


    //tìm kiếm nhân viên theo lương
    public void searchBySalary(double minSalary) {
        for (Employee emp : employees) {
            if (emp.getIncome() >= minSalary) {
                System.out.println(emp);
            }
        }
    }

    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }


}
