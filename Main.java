package Ontap.baitapATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời nhập password: ");
        String password = scanner.nextLine();

        Account account = new Account("techmaster","hoclacoviec",1000000);

        if(username.equals("techmaster") && password.equals("hoclacoviec")) {
            System.out.println("login successful");
            System.out.println("1. Xem thông tin tài khoản.");
            System.out.println("2. Thoát.");
            System.out.println("Mời chọn chức năng");
            int chosse = Integer.parseInt(scanner.nextLine());
            switch(chosse) {
                case 1:
                    System.out.println("------Thông tin tài khoản-----");
                    System.out.println("Tên: "+account.getUsername());
                    System.out.println("Số dư hiện tại: "+account.getBalance()+"VNĐ");
                    break;
                case 2:
                    break;
                default:

            }



        }else {
            System.out.println("Login Failed");
        }
    }

}
