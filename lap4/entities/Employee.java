package ThuchanhOOP.lap4.entities;

public class Employee {
    private static int idcounter=0;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = ++idcounter;
        this.name = name;
        this.salary = salary;
    }

    public static int getIdcounter() {
        return idcounter;
    }

    public static void setIdcounter(int idcounter) {
        Employee.idcounter = idcounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIncome() {
        return salary;
    }

    public double calculateTax() {
        double income = getIncome();
        if (income < 11000000) {
            return 0;
        } else {
            return (income - 11000000) * 0.1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", tên='" + name + '\'' +
                ", lương=" + salary +
                ", thu nhập=" + getIncome() +
                ", thuế=" + calculateTax() +
                '}';
    }
}
