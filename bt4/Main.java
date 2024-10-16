package Ontap.buoi6.bt4;

import Ontap.buoi6.bt4.entities.Doctor;
import Ontap.buoi6.bt4.entities.Patient;
import Ontap.buoi6.bt4.service.DoctorService;
import Ontap.buoi6.bt4.service.PatientService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DoctorService doctorService = new DoctorService();
            PatientService patientService = new PatientService();

            System.out.println("Số bác sĩ cần nhập: ");
            int n = Integer.parseInt(scanner.nextLine());
            Doctor []arrDoctor = new Doctor[n];

            for (int i = 0; i < n; i++) {
                Doctor doctor = doctorService.inputInfo(scanner);
                arrDoctor[i] = doctor;
                //doctorService.displayDoctor(doctor);
            }

            for (int i = 0; i < n; i++) {
                doctorService.displayDoctor(arrDoctor[i]);
            }

            System.out.println("Số bệnh nhân cần nhập: ");
            int m = Integer.parseInt(scanner.nextLine());
            Patient []arrPatient = new Patient[m];

             for (int i = 0; i < m; i++) {
                Patient patient = patientService.inputInfo(scanner);
                arrPatient[i] = patient;
                //patientService.displayPatient(patient);
             }

             for (int i = 0; i < m; i++) {
                 patientService.displayPatient(arrPatient[i]);
             }


    }
}
