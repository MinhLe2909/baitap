package ThuchanhOOP.lap4.entities;

public class Leader extends Employee{

    private double salaryResp;

    public Leader(String name, double salary, double salaryResp) {
        super(name, salary);
        this.salaryResp = salaryResp;
    }

    public double getSalaryResp() {
        return salaryResp;
    }

    public void setSalaryResp(double salaryResp) {
        this.salaryResp = salaryResp;
    }

    @Override
    public double getIncome() {
        return getSalary() + salaryResp;
    }

    @Override
    public String toString() {
        return "Leader{" +
                "id=" + getId() +
                ", tên='" + getName() + '\'' +
                ", lương=" + getSalary() +
                ", lương trách nhiệm=" + salaryResp +
                ", thu nhập=" + getIncome() +
                ", thuế=" + calculateTax() +
                '}';
    }
}
