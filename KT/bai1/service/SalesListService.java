package Ontap.KT.bai1.service;


import Ontap.KT.bai1.entities.Item;
import Ontap.KT.bai1.entities.SalesList;
import Ontap.KT.bai1.entities.SalesPerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SalesListService {
    private ArrayList<SalesList> salesLists = new ArrayList<>();
    private ArrayList<Item> soldItems = new ArrayList<>();

    public SalesList createSalesList(Scanner scanner, ArrayList<SalesPerson> salesPersons, ArrayList<Item> items) {
        if (salesPersons.isEmpty() || items.isEmpty()) { // check tt rỗng
            System.out.println("Cần nhập danh sách nhân viên và mặt hàng trước.");
            return null;
        }

        System.out.println("Chọn nhân viên bán hàng: ");
        for (int i = 0; i < salesPersons.size(); i++) {
            System.out.println((i + 1) + ". " + salesPersons.get(i).getName());
        }
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        SalesPerson selectedPerson = salesPersons.get(index);

        SalesList salesList = new SalesList(selectedPerson);
        System.out.println("Nhập số lượng mặt hàng đã bán (tối đa 5): ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count && i < 5; i++) {
            System.out.println("Chọn mặt hàng:");
            for (int j = 0; j < items.size(); j++) {
                System.out.println((j + 1) + ". " + items.get(j).getName());
            }
            int itemIndex = Integer.parseInt(scanner.nextLine()) - 1;
            Item item = items.get(itemIndex);
            addSoldItem(item);
        }

        salesLists.add(salesList);
        System.out.println("Đã thêm bảng danh sách bán hàng.");
        System.out.println(salesList);
        return salesList;
    }


    public void addSoldItem(Item item) {
        // Kiểm tra nếu mặt hàng đã tồn tại trong danh sách
        for (Item soldItem : soldItems) {
            if (soldItem.getItemId() == item.getItemId()) {
                System.out.println("Mặt hàng đã được bán, không thể bán 2 lần.");
                return;
            }
        }
        soldItems.add(item);
    }


    public double calculateTotalRevenue() {
        double totalRevenue = 0;

        for (SalesList sl : salesLists) {
            double revenue = 0;
            // Tính doanh thu cho từng SalesList
            for (Item item : sl.getSoldItems()) {
                revenue += item.getPrice() * item.getQuantity();
            }
            // Cộng vào tổng doanh thu
            totalRevenue += revenue;

            // In tên nhân viên và doanh thu của họ
            System.out.println("Nhân viên: " + sl.getSalesperson().getName() +
                    ", Doanh thu: " + revenue);
        }
        // Trả về tổng doanh thu
        return totalRevenue;
    }

}
