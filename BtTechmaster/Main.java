package Ontap.buoi9.bai1;

import Ontap.buoi7.bai2.intities.TechmasterStudent;
import Ontap.buoi9.bai1.entities.Techmaster;
import Ontap.buoi9.bai1.service.TechmasterService;
import Ontap.buoi9.bai1.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // tạo ra trung tâm -> nhập dữ liệu

        Scanner scanner = new Scanner(System.in);
        TechmasterService techmasterService = new TechmasterService();
        Techmaster techmaster = techmasterService.inputInfo(scanner);
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu(scanner,techmaster);
        }
    }
}
