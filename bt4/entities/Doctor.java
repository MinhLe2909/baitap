package Ontap.buoi6.bt4.entities;

public class Doctor extends People {
    private String specialty;
    private int workingHours;

    public Doctor(String name, int age, String specialty, int workingHours) {
        super(name, age);
        this.specialty = specialty;
        this.workingHours = workingHours;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }
}
