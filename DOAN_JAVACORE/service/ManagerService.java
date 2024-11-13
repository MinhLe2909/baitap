package DOAN_JAVACORE.service;

import DOAN_JAVACORE.data.Database;
import DOAN_JAVACORE.entities.User;
import java.util.Scanner;

public class ManagerService {

    UserService userService;
    BookService bookService;
    TicketService ticketService;

    public ManagerService(UserService userService, BookService bookService, TicketService ticketService) {
        this.userService = userService;
        this.bookService = bookService;
        this.ticketService = ticketService;
    }

    // Thêm tài khoản người dùng
    public void addUser(Scanner scanner) {
        System.out.print("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        System.out.print("Nhập vai trò (User): ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("User")) {
            User user = new User(username, password, role);
            Database.users.add(user);
            System.out.println("Thêm tài khoản người dùng thành công.");
        } else {
            System.out.println("Chỉ có thể thêm tài khoản với vai trò User.");
        }
    }

    // Chỉnh sửa tài khoản người dùng
    public void editUser(Scanner scanner) {
        System.out.print("Nhập ID người dùng cần sửa: ");
        int userId = Integer.parseInt(scanner.nextLine());
        User user = findUserById(userId);

        if (user != null) {
            System.out.print("Nhập tên đăng nhập mới: ");
            String newUsername = scanner.nextLine();
            System.out.print("Nhập mật khẩu mới: ");
            String newPassword = scanner.nextLine();

            user.setUsername(newUsername);
            user.setPassword(newPassword);
            System.out.println("Cập nhật thông tin người dùng thành công.");
        } else {
            System.out.println("Không tìm thấy người dùng với ID đã nhập.");
        }
    }

    // Xóa tài khoản người dùng
    public void deleteUser(Scanner scanner) {
        System.out.print("Nhập ID người dùng cần xóa: ");
        int userId = Integer.parseInt(scanner.nextLine());
        User user = findUserById(userId);

        if (user != null && !user.getRole().equalsIgnoreCase("Manager")) {
            Database.users.remove(user);
            System.out.println("Xóa tài khoản người dùng thành công.");
        } else {
            System.out.println("Không thể xóa tài khoản quản lý hoặc không tìm thấy người dùng.");
        }
    }

    // Xem danh sách tất cả tài khoản
    public void displayAllUsers() {
        System.out.println("\n--- Danh sách người dùng ---");
        for (User user : Database.users) {
            System.out.println(user);
        }
    }

    // Tìm người dùng theo ID
    public User findUserById(int userId) {
        return Database.users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }
}
