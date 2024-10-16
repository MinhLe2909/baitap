package Ontap.buoi6.bt4.entities;

import java.util.Date;

public class Patient extends People {
    private String medicalRecordNumber;
    private String admissionDate;

    public Patient(String name, int age, String medicalRecordNumber, String admissionDate) {
        super(name, age);
        this.medicalRecordNumber = medicalRecordNumber;
        this.admissionDate = admissionDate;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "medicalRecordNumber='" + medicalRecordNumber + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                '}';
    }
}
