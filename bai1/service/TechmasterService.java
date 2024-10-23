package Ontap.buoi9.bai1.service;

import Ontap.buoi9.bai1.entities.Classroom;
import Ontap.buoi9.bai1.entities.Techmaster;


import java.util.Scanner;

public class TechmasterService {
    public Techmaster inputInfo(Scanner scanner){
        ClassRoomService classRoomService = new ClassRoomService();
        System.out.println("Nhập quản lý lớp: ");
        String management = scanner.nextLine();
        System.out.println("Nhập giảng viên: ");
        String lecturer = scanner.nextLine();

        System.out.println("Nhập thông tin lớp học");
        Classroom classroom = classRoomService.inputInfo(scanner);
        return new Techmaster(management, lecturer, classroom);


    }


}
