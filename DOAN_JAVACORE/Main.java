package DOAN_JAVACORE;

import DOAN_JAVACORE.service.BookService;
import DOAN_JAVACORE.service.UserService;
import DOAN_JAVACORE.service.TicketService;
import DOAN_JAVACORE.view.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        UserService userService = new UserService();
        TicketService ticketService = new TicketService();
        Menu menu = new Menu(bookService, userService, ticketService);

        menu.displayMainMenu(scanner);
    }
}




