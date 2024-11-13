package DOAN_JAVACORE.service;

import DOAN_JAVACORE.data.Database;
import DOAN_JAVACORE.entities.User;
import java.util.Scanner;

public class UserService {


    public User login(Scanner scanner) {
        System.out.print("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();


        for (User user : Database.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


    public void register(Scanner scanner) {
        System.out.print("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();


        User newUser = new User(username, password, "user");
        Database.users.add(newUser);
        System.out.println("Đăng ký thành công!");
    }
}
