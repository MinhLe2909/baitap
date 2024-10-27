package KiemTraOOP.bai2.view;

import KiemTraOOP.bai2.entities.User;
import KiemTraOOP.bai2.service.UserService;

import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();
    public void displayMenu(Scanner scanner){
        while (true){
            if(!userService.isLoggedIn()){
                System.out.println("1. Đăng nhập");
                System.out.println("2. Đăng ký");
                System.out.println("0. Thoát chương trình");
                System.out.println("Mời chọn chức năng: ");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        userService.login(scanner);
                        break;
                    case 2:
                        userService.register(scanner);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }

            }else {
                System.out.println("1. Thay đổi username");
                System.out.println("2. Thay đổi email");
                System.out.println("3. Thay đổi password");
                System.out.println("4. Đăng xuất");
                System.out.println("0. Thoát chương trình");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.print("Nhập username mới: ");
                        String newUsername = scanner.nextLine();
                        if (!userService.isUsernameExists(newUsername)) {
                            userService.getCurrentUser().setUsername(newUsername);
                            System.out.println("Username đã được thay đổi.");
                        } else {
                            System.out.println("Username đã tồn tại.");
                        }
                        break;
                    case 2:
                        System.out.print("Nhập email mới: ");
                        String newEmail = scanner.nextLine();
                        if (!User.isValidEmail(newEmail)) {
                            System.out.println("Email không hợp lệ.");
                        } else if (!userService.isEmailExists(newEmail)) {
                            userService.getCurrentUser().setEmail(newEmail);
                            System.out.println("Email đã được thay đổi.");
                        } else {
                            System.out.println("Email đã tồn tại.");
                        }
                        break;
                    case 3:
                        System.out.print("Nhập mật khẩu mới: ");
                        String newPassword = scanner.nextLine();
                        if (User.isValidPassword(newPassword)) {
                            userService.getCurrentUser().setPassword(newPassword);
                            System.out.println("Mật khẩu đã được thay đổi.");
                        } else {
                            System.out.println("Mật khẩu không hợp lệ.");
                        }
                        break;
                    case 4:
                        userService.logout();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Chức năng không hợp lệ");

                }

            }

        }

    }

}
