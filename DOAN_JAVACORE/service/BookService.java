package DOAN_JAVACORE.service;

import DOAN_JAVACORE.data.Database;
import DOAN_JAVACORE.entities.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

    // Thêm sách
    public void addBook(Scanner scanner) {
        System.out.print("Nhập tên sách: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập thể loại: ");
        String genre = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int yearPublished = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, author, genre, yearPublished, quantity);
        Database.books.add(book);
        System.out.println("Thêm sách thành công.");
    }

    // Chỉnh sửa sách
    public void editBook(Scanner scanner) {
        System.out.print("Nhập ID sách cần sửa: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        Book book = findBookById(bookId);

        if (book != null) {
            System.out.print("Nhập tên sách mới: ");
            book.setTitle(scanner.nextLine());
            System.out.print("Nhập tác giả mới: ");
            book.setAuthor(scanner.nextLine());
            System.out.print("Nhập thể loại mới: ");
            book.setGenre(scanner.nextLine());
            System.out.print("Nhập năm xuất bản mới: ");
            book.setYearPublished(Integer.parseInt(scanner.nextLine()));
            System.out.print("Nhập số lượng mới: ");
            book.setQuantity(Integer.parseInt(scanner.nextLine()));
            System.out.println("Chỉnh sửa sách thành công.");
        } else {
            System.out.println("Không tìm thấy sách với ID đã nhập.");
        }
    }

    // Xóa sách
    public void deleteBook(Scanner scanner) {
        System.out.print("Nhập ID sách cần xóa: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        Book book = findBookById(bookId);

        if (book != null) {
            Database.books.remove(book);
            System.out.println("Xóa sách thành công.");
        } else {
            System.out.println("Không tìm thấy sách với ID đã nhập.");
        }
    }

    // Hiển thị tất cả sách
    public void displayAllBooks() {
        System.out.println("\n--- Danh sách sách ---");
        for (Book book : Database.books) {
            System.out.println(book);
        }
    }

    public void displayBooksByGenre(Scanner scanner) {
        System.out.print("Nhập thể loại muốn xem: ");
        String genre = scanner.nextLine();

        System.out.println("\n--- Danh sách sách thuộc thể loại: " + genre + " ---");
        boolean found = false;

        for (Book book : Database.books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(book.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách thuộc thể loại: " + genre);
        }
    }

    public void displayBooksByAuthor(Scanner scanner) {
        System.out.print("Nhập tên tác giả muốn xem: ");
        String author = scanner.nextLine();

        System.out.println("\n--- Danh sách sách của tác giả: " + author + " ---");
        boolean found = false;

        for (Book book : Database.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách của tác giả: " + author);
        }
    }


    // Tìm sách theo ID
    private Book findBookById(int bookId) {
        for (Book book : Database.books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    //tìm kiếm sách
    public void searchBook(Scanner scanner) {
        System.out.println("Tìm kiếm sách theo:");
        System.out.println("1. Tên sách");
        System.out.println("2. Tác giả");
        System.out.println("3. Thể loại");
        System.out.println("4. Năm xuất bản");
        System.out.print("Chọn tiêu chí tìm kiếm: ");
        int choice = Integer.parseInt(scanner.nextLine());

        ArrayList<Book> results = new ArrayList<>();

        switch (choice) {
            case 1:
                System.out.print("Nhập tên sách: ");
                String title = scanner.nextLine();
                for (Book book : Database.books) {
                    if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                        results.add(book);
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tác giả: ");
                String author = scanner.nextLine();
                for (Book book : Database.books) {
                    if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                        results.add(book);
                    }
                }
                break;
            case 3:
                System.out.print("Nhập thể loại: ");
                String genre = scanner.nextLine();
                for (Book book : Database.books) {
                    if (book.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                        results.add(book);
                    }
                }
                break;
            case 4:
                System.out.print("Nhập năm xuất bản: ");
                int year = Integer.parseInt(scanner.nextLine());
                for (Book book : Database.books) {
                    if (book.getYearPublished() == year) {
                        results.add(book);
                    }
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

        if (results.isEmpty()) {
            System.out.println("Không tìm thấy sách.");
        } else {
            System.out.println("\n--- Kết quả tìm kiếm ---");
            for (Book book : results) {
                System.out.println(book);
            }
        }
    }
}
