package ThuchanhOOP.lap4.entities;

public class SaleEmployee extends Employee {

    private double salesVolume;
    private double commissionRate;

    public SaleEmployee(String name, double salary, double salesVolume, double commissionRate) {
        super(name, salary);
        this.salesVolume = salesVolume;
        this.commissionRate = commissionRate;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getIncome() {
        return getSalary() + (salesVolume * commissionRate);
    }

    @Override
    public String toString() {
        return "Nhân viên tiếp thị{" +
                "id=" + getId() +
                ", tên='" + getName() +
                ", lương=" + getSalary() +
                ", doanh số=" + salesVolume +
                ", tỉ lệ hoa hồng=" + commissionRate +
                ", thu nhập=" + getIncome() +
                ", thuế=" + calculateTax() +
                '}';
    }
}
