package Ontap.buoi6.bt4.service;

import Ontap.buoi6.bt4.entities.Doctor;
import Ontap.buoi6.bt4.entities.Patient;

import java.util.Date;
import java.util.Scanner;

public class PatientService {
    public Patient inputInfo(Scanner scanner){
        System.out.println("-----Nhập dữ liệu bệnh nhân-----");
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập số bệnh án: ");
        String medicalRecordNumber = scanner.nextLine();
        System.out.println("Mời nhập ngày nhập viện: ");
        String admissionDate = scanner.nextLine();


        return new Patient(name, age, medicalRecordNumber, admissionDate);

    }

    public void displayPatient(Patient patient){
        System.out.println("-----Thông tin bệnh nhân-----");
        System.out.println("Tên:"+patient.getName());
        System.out.println("Tuổi: "+patient.getAge());
        System.out.println("Số bệnh án: "+patient.getMedicalRecordNumber());
        System.out.println("Ngày nhập viện: "+patient.getAdmissionDate());

    }


}
