package KiemTraOOP.bai2.service;

import KiemTraOOP.bai2.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    // tạo tài khoản
    public void register(Scanner scanner){
        System.out.println("----Tạo Tài Khoản-----");
        System.out.println("Nhập Username: ");
        String username = scanner.nextLine();
        //check tài khoản chưa tồn tại
            if (isUsernameExists(username)) {
                System.out.println("Username đã tồn tại.");
                return;
            }

            System.out.println("Nhập Password: ");
            String password = scanner.nextLine();
            if (!User.isValidPassword(password)) {
                System.out.println("Password phải dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa và 1 ký tự đặc biệt.");
                return;
            }

            System.out.println("Nhập Email: ");
            String email = scanner.nextLine();
            if (isEmailExists(username)) {
                System.out.println("Email đã tồn tại.");
                return;
            }
            if (!User.isValidEmail(email)) {
                System.out.println("Email không hợp lệ");
                return;
            }
            User user = new User(username, password, email);
            users.add(user);
            System.out.println("Tạo tài khoản thành công");

    }

    // Check username đã tồn tại chưa
    public boolean isUsernameExists(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    // Check email đã tồn tại chưa
    public boolean isEmailExists(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;

    }

    // Kiểm tra người dùng hiện tại có đang đăng nhập ko
    public boolean isLoggedIn() {
        return currentUser != null;
    }

    // đăng nhập
    public void login(Scanner scanner){
        System.out.println("-----Đăng Nhập-----");
        System.out.println("Nhập Username: ");
        String username = scanner.nextLine();
        User user = getUserByUsername(username);
        if (user == null) {
            System.out.println("Kiểm tra lại username");
            return;
        }

        System.out.println("Nhập Password: ");
        String password = scanner.nextLine();
        if(!user.getPassword().equalsIgnoreCase(password)) {
            System.out.println("Password không đúng");
            System.out.println("1. Đăng nhập lại");
            System.out.println("2. Quên mật khẩu");
            int chosse = Integer.parseInt(scanner.nextLine());
            if (chosse == 1) {
                login(scanner);
            } else if (chosse == 2) {
                forgotPassword(scanner);
            }
        }else{
            currentUser = user;
            System.out.println("Chào mừng " + user.getUsername()+", bạn có thể thực hiện các công việc sau:");
        }

    }

    // Hiển thị người dùng hiện tại
    public User getCurrentUser() {
        return currentUser;
    }


    // Tìm user theo username
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }


    // Tìm lại password
    public void forgotPassword(Scanner scanner){
        System.out.println("-----Quên Mật Khẩu-----");
        System.out.println("Nhập Email: ");
        String email = scanner.nextLine();
        User user = getUserByEmail(email);

        if (user == null) {
            System.out.println("Email Không tồn tại");
            return;
        }

        System.out.println("Nhập lại password mới: ");
        String newPassword = scanner.nextLine();
        if(!User.isValidPassword(newPassword)) {
            System.out.println("Password không hợp lệ");
            return;
        }
        user.setPassword(newPassword);
        System.out.println("Đổi password thành công. Mời bạn đăng nhập lại");
    }

    // Tìm user theo email
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    // đăng xuất
    public void logout() {
        currentUser = null;
        System.out.println("Bạn đã đăng xuất.");
    }

}
