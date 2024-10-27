package Ontap.KT.bai1.entities;

public class People {
    private String name;
    private String address;
    private int phone;

    public People(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone: " + phone;
    }
}
