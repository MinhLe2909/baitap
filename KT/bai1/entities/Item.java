package Ontap.KT.bai1.entities;

public class Item {
    private static int idCounter = 1000; // Mã mặt hàng tự động tăng
    private int itemId;
    private String name;
    private String commodityGroup;
    private double price;
    private int quantity;

    public Item(String name, String commodityGroup, double price, int quantity) {
        this.itemId = ++idCounter;
        this.name = name;
        this.commodityGroup = commodityGroup;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getCommodityGroup() {
        return commodityGroup;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + name + ", Group: " + commodityGroup + ", Price: " + price + ", Quantity: " + quantity;
    }
}
