package Ontap.KT.bai1.entities;

public class SalesPerson extends People {
    private static int idCounter = 1000; // Tự động tăng mã nhân viên
    private int employeeId;
    private String contractDate;

    public SalesPerson(String name, String address, int phone, String contractDate) {
        super(name, address, phone);
        this.employeeId = ++idCounter;
        this.contractDate = contractDate;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", " + super.toString() + ", Contract Date: " + contractDate;
    }
}
