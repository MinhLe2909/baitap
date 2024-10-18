package Ontap.buoi7.bai2;

import Ontap.buoi7.bai2.intities.BizStudent;
import Ontap.buoi7.bai2.intities.ItStudent;
import Ontap.buoi7.bai2.intities.TechmasterStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng sinh viên IT: ");
        int n = Integer.parseInt(scanner.nextLine());
        ItStudent []arrIt = new ItStudent[n];
        for (int i = 0; i < n; i++) {
            System.out.println("-----Nhập thông tin sinh viên it-----");
            System.out.println("Mời nhập tên: ");
            String nameit = scanner.nextLine();
            System.out.println("Mời nhập ngành: ");
            String majorit = scanner.nextLine();
            System.out.println("Mời nhập điểm môn java: ");
            double java = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập điểm môn html: ");
            double html = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập điểm môn css: ");
            double css = Double.parseDouble(scanner.nextLine());

            arrIt[i] = new ItStudent(nameit, majorit, java, html, css);
        }
        for (int i = 0; i < n; i++) {
            ItStudent itStudent = arrIt[i];
            itStudent.getInfo();
        }

        System.out.println("Mời nhập số lượng sinh viên BIZ: ");
        int m = Integer.parseInt(scanner.nextLine());
        BizStudent []arrBiz = new BizStudent[m];
        for (int i = 0; i < m; i++) {
            System.out.println("-----Nhập thông tin sinh viên biz-----");
            System.out.println("Mời nhập tên: ");
            String namebiz = scanner.nextLine();
            System.out.println("Mời nhập ngành: ");
            String majorbiz = scanner.nextLine();
            System.out.println("Mời nhập điểm môn marketing: ");
            double marketing = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập điểm môn sales: ");
            double sales = Double.parseDouble(scanner.nextLine());

            arrBiz[i] = new BizStudent(namebiz, majorbiz, marketing, sales);

        }

        for (int i = 0; i < n; i++) {
            BizStudent bizStudent = arrBiz[i];
            bizStudent.getInfo();
        }




    }
}
