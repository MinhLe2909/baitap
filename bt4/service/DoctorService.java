package Ontap.buoi6.bt4.service;

import Ontap.buoi6.bt4.entities.Doctor;

import java.util.Scanner;

public class DoctorService {
    public Doctor inputInfo(Scanner scanner){
        System.out.println("-----Nhập dữ liệu bác sĩ-----");
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập khoa: ");
        String specialty = scanner.nextLine();
        System.out.println("Mời nhập số giờ làm: ");
        int workingHours = Integer.parseInt(scanner.nextLine());

        return new Doctor(name, age, specialty, workingHours);

    }

    public void displayDoctor(Doctor doctor){
        System.out.println("-----Thông tin bác sĩ-----");
        System.out.println("Tên:"+doctor.getName());
        System.out.println("Tuổi: "+doctor.getAge());
        System.out.println("Khoa: "+doctor.getSpecialty());
        System.out.println("Số giờ làm: "+doctor.getWorkingHours());

    }

}
