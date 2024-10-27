package Ontap.KT.bai1.service;

import Ontap.KT.bai1.entities.Item;

import java.util.Scanner;

public class ItemService {
    public Item inputInfo(Scanner scanner){
        System.out.println("-----Nhập hàng hóa-----");
        System.out.println("Nhập tên hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập nhóm hàng: ");
        String group = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Item item = new Item(name, group, price, quantity);
        return item;

    }

}
