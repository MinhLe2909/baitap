package KiemTraOOP.bai2;

import KiemTraOOP.bai2.entities.User;
import KiemTraOOP.bai2.service.UserService;
import KiemTraOOP.bai2.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.displayMenu(scanner);

    }
}
