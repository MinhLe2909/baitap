package BTVN_ATM;
import java.util.Scanner;

public class Main {
    private static Account account;

    public static void main(String[] args) {
        account = new Account("techmaster", "hoclacoviec", 1000000);
        login();
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Nhập username: ");
            String username = scanner.nextLine();
            System.out.print("Nhập password: ");
            String password = scanner.nextLine();

            if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
                loggedIn = true;
                showMenu();
            } else {
                System.out.println("Đăng nhập thất bại.");
                System.out.print("Bạn có muốn thử lại không? (Y/N): ");
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("Y")) {
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                }
            }
        }
    }

    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Xem thông tin tài khoản");
            System.out.println("2. Rút tiền");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAccountInfo();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }

            System.out.print("Bạn có muốn tiếp tục không? (Y/N): ");
            String continueChoice = scanner.next();
            if (continueChoice.equalsIgnoreCase("N")) {
                running = false;
                System.out.println("Thoát chương trình.");
            }
        }
    }

    private static void viewAccountInfo() {
        System.out.println("Thông tin tài khoản:");
        System.out.println("Username: " + account.getUsername());
        System.out.println("Password: " + account.getPassword());
        System.out.println("Balance: " + account.getBalance() + " VNĐ");
    }

    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền muốn rút: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
