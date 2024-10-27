package Ontap.KT.bai1;

import Ontap.KT.bai1.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu(scanner);
        }
    }
}
