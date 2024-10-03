package BTVN_Buoi2;

import java.util.Scanner;

public class BTVN_Buoi2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Nhập Thông Tin-----");
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        String checkAge = (age>0 && age <= 100)? "":"Cảnh báo: Tuổi nhập không hợp lệ";
        System.out.println(checkAge);
        System.out.println("Mời nhập môn học: ");
        String gender = scanner.nextLine();
        System.out.println("Mời nhập email: ");
        String email = scanner.nextLine();
        String checkEmail = email.contains("@") ? "" : "Cảnh báo: Email không hợp lệ do thiếu ký tự @";
        System.out.println(checkEmail);



        System.out.println("-----Thông Tin-----");
        System.out.println("Tên: "+name);
        System.out.print("Tuổi: "+age);
        System.out.println("\t"+checkAge);
        System.out.println("Môn học: "+gender);
        System.out.print("Email: "+email );
        System.out.print("\t"+checkEmail);

    }
}
