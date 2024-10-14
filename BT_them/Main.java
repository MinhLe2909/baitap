package Ontap.BT_them;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng loài vật: ");
        int numberAnimal =  Integer.parseInt(scanner.nextLine());

        Animal [] arrAnimal = new Animal[numberAnimal];

        for (int i = 0; i < numberAnimal; i++) {
            System.out.println("Mời nhập thông tin loài thứ " + (i + 1) + ": ");
            System.out.println("Nhập ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên: " );
            String name = scanner.nextLine();
            System.out.println("Nhập mô tả: " );
            String description = scanner.nextLine();
            System.out.println("Nhập giới tính (nhập true nếu là đực, false nếu là cái): " );
            Boolean gender = Boolean.parseBoolean(scanner.nextLine());

            arrAnimal[i] = new Animal(id, name, description, gender);


        }
        System.out.println("-----Thông tin các loài vừa nhập-----");
        for (int i = 0; i < numberAnimal; i++) {
            System.out.println(arrAnimal[i]);

        }


    }


}
