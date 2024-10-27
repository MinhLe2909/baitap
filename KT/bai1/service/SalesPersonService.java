package Ontap.KT.bai1.service;

import Ontap.KT.bai1.entities.SalesPerson;

import java.util.Scanner;

public class SalesPersonService {
    public SalesPerson inputInfo(Scanner scanner){
        System.out.println("-----Nhập nhân viên-----");
        System.out.println("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày ký hợp đồng: ");
        String contractDate = scanner.nextLine();

        SalesPerson sp = new SalesPerson(name, address, phone, contractDate);
        return sp;

    }
}
