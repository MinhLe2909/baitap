package DOAN_JAVACORE.view;

import DOAN_JAVACORE.service.BookService;
import DOAN_JAVACORE.service.UserService;
import DOAN_JAVACORE.service.TicketService;
import DOAN_JAVACORE.service.ManagerService;
import DOAN_JAVACORE.entities.User;

import java.util.Scanner;

public class Menu {

    BookService bookService;
    UserService userService;
    TicketService ticketService;
    ManagerService managerService;

    public Menu(BookService bookService, UserService userService, TicketService ticketService) {
        this.bookService = bookService;
        this.userService = userService;
        this.ticketService = ticketService;
        this.managerService = new ManagerService(userService, bookService, ticketService);
    }

    // Menu chính
    public void displayMainMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nChào mừng đến với THƯ VIỆN TECH!\n");

            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Login
                    User loggedInUser = userService.login(scanner);
                    if (loggedInUser != null) {
                        if (loggedInUser.getRole().equals("Manager")) {
                            displayManagerMenu(scanner);
                        } else {
                            displayUserMenu(scanner, loggedInUser);
                        }
                    } else {
                        System.out.println("Đăng nhập thất bại!");
                    }
                    break;
                case 2:
                    // Register
                    userService.register(scanner);
                    break;
                case 3:
                    // Exit
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // Manager menu
    public void displayManagerMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n---- Quản lý thư viện (Manager) ----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xem tất cả phiếu mượn");
            System.out.println("6. Thêm tài khoản người dùng");
            System.out.println("7. Sửa tài khoản người dùng");
            System.out.println("8. Xóa tài khoản người dùng");
            System.out.println("9. Hiển thị tất cả người dùng");
            System.out.println("10. Hiển thị tất cả sách");
            System.out.println("0. Đăng xuất");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookService.addBook(scanner);
                    break;
                case 2:
                    bookService.editBook(scanner);
                    break;
                case 3:
                    bookService.deleteBook(scanner);
                    break;
                case 4:
                    bookService.searchBook(scanner);
                    break;
                case 5:
                    ticketService.displayAllTickets();
                    break;
                case 6:
                    managerService.addUser(scanner);
                    break;
                case 7:
                    managerService.editUser(scanner);
                    break;
                case 8:
                    managerService.deleteUser(scanner);
                    break;
                case 9:
                    managerService.displayAllUsers();
                    break;
                case 10:
                    bookService.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Đăng xuất thành công.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (choice != 0);
    }

    // User menu
    public void displayUserMenu(Scanner scanner, User user) {
        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Tìm kiếm sách");
            System.out.println("2. Mượn sách");
            System.out.println("3. Trả sách");
            System.out.println("4. Xem tất cả Sách");
            System.out.println("5. Xem sách theo thể loại");
            System.out.println("6. Xem sách theo tác giả");
            System.out.println("0. Đăng xuất");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookService.searchBook(scanner);
                    break;
                case 2:
                    ticketService.borrowBook(scanner, user);
                    break;
                case 3:
                    ticketService.returnBook(scanner, user);
                    break;
                case 4:
                    bookService.displayAllBooks();
                    break;
                case 5:
                    bookService.displayBooksByGenre(scanner);
                    break;
                case 6:
                    bookService.displayBooksByAuthor(scanner);
                    break;
                case 0:
                    System.out.println("Đăng xuất thành công.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (choice != 0);
    }
}