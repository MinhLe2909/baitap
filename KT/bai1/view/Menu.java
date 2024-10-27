package Ontap.KT.bai1.view;

import Ontap.KT.bai1.entities.Item;
import Ontap.KT.bai1.entities.SalesList;
import Ontap.KT.bai1.entities.SalesPerson;
import Ontap.KT.bai1.service.ItemService;
import Ontap.KT.bai1.service.SalesListService;
import Ontap.KT.bai1.service.SalesPersonService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<SalesPerson> salesPersons = new ArrayList<>();
    private ArrayList<SalesList> salesLists = new ArrayList<>();
    SalesListService salesListService = new SalesListService();
    public void displayMenu(Scanner scanner) {
        System.out.println("----------MENU----------");
        System.out.println("1. Nhập danh sách mặt hàng");
        System.out.println("2. Nhập danh sách nhân viên");
        System.out.println("3. Lập bảng danh sách bán hàng");
        System.out.println("4. Sắp xếp bảng danh sách bán hàng theo tên nhân viên");
        System.out.println("5. Sắp xếp bảng danh sách bán hàng theo nhóm mặt hàng");
        System.out.println("6. Lập bảng kê doanh thu cho mỗi nhân viên");
        System.out.println("7. Thoát");
        System.out.print("Chọn chức năng: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                ItemService itemService = new ItemService();
                Item item = itemService.inputInfo(scanner);
                items.add(item);
                System.out.println("-----Danh sách hàng hóa-----");
                for (Item it: items){
                    System.out.println(it);
                }
                break;
            case 2:
                SalesPersonService salesPersonService = new SalesPersonService();
                SalesPerson salesPerson  =salesPersonService.inputInfo(scanner);
                salesPersons.add(salesPerson);
                System.out.println("-----Danh sách nhân viên-----");
                for (SalesPerson sp: salesPersons){
                    System.out.println(sp);
                }
                break;
            case 3:
                SalesList salesList = salesListService.createSalesList(scanner, salesPersons, items);
                if (salesList != null) {
                    salesLists.add(salesList);  // Đảm bảo đã thêm salesList vào salesLists của Menu
                }
                System.out.println("-----Danh sách bán hàng-----");
                System.out.println("Tổng số danh sách bán hàng: " + salesLists.size());
                for (SalesList sl : salesLists) {
                    System.out.println(sl);
                }
                break;
            case 4:
                System.out.println("Chức năng sẽ được update sau :3 ");
                break;
            case 5:
                System.out.println("Chức năng sẽ được update sau :3 ");
                break;
            case 6:
                salesListService.calculateTotalRevenue();
                break;
            case 7:
                System.exit(0);
        }
    }

}
