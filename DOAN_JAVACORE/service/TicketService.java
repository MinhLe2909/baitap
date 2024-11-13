package DOAN_JAVACORE.service;

import DOAN_JAVACORE.data.Database;
import DOAN_JAVACORE.entities.Book;
import DOAN_JAVACORE.entities.Ticket;
import DOAN_JAVACORE.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketService {

    // Mượn sách
    public void borrowBook(Scanner scanner, User user) {
        System.out.print("Nhập ID sách muốn mượn: ");
        int bookId = Integer.parseInt(scanner.nextLine());

        // Kiểm tra sách có sẵn không
        Book book = findBookById(bookId);
        if (book != null && book.getQuantity() > 0) {
            Ticket ticket = new Ticket(user.getId(), bookId);
            Database.tickets.add(ticket);
            book.setQuantity(book.getQuantity() - 1);  // Giảm số lượng sách
            System.out.println("Mượn sách thành công. Bạn có 15 ngày để trả sách.");
        } else {
            System.out.println("Sách này không có sẵn để mượn.");
        }
    }

    // Trả sách
    public void returnBook(Scanner scanner, User user) {
        System.out.print("Nhập ID sách muốn trả: ");
        int bookId = Integer.parseInt(scanner.nextLine());

        Ticket ticket = findTicket(user.getId(), bookId);
        if (ticket != null) {
            Database.tickets.remove(ticket);
            Book book = findBookById(bookId);
            if (book != null) {
                book.setQuantity(book.getQuantity() + 1);  // Tăng số lượng sách
            }
            System.out.println("Trả sách thành công.");
        } else {
            System.out.println("Không tìm thấy thông tin mượn sách của bạn.");
        }
    }

    // Hiển thị phiếu mượn
    public void displayAllTickets() {
        if (Database.tickets.isEmpty()) {
            System.out.println("Không có phiếu mượn nào trong hệ thống.");
        } else {
            System.out.println("\n--- Danh sách tất cả phiếu mượn ---");
            for (Ticket ticket : Database.tickets) {
                Book book = findBookById(ticket.getBookId());

                if (book != null) {
                    System.out.println("Phiếu mượn: " + ticket);
                    System.out.println("Thông tin sách được mượn: ");
                    System.out.println("  - Tên sách: " + book.getTitle());
                    System.out.println("  - Số lượng còn lại: " + book.getQuantity());
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("Phiếu mượn không hợp lệ. Không tìm thấy thông tin sách cho ID: " + ticket.getBookId());
                }
            }
        }
    }


    // Tìm phiếu mượn
    public Ticket findTicket(int userId, int bookId) {
        for (Ticket ticket : Database.tickets) {
            if (ticket.getUserId() == userId && ticket.getBookId() == bookId) {
                return ticket;
            }
        }
        return null;
    }

    public Book findBookById(int bookId) {
        for (Book book : Database.books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}





