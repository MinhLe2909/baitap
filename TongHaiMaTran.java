package BTVN_Buoi4;

import java.util.Scanner;

public class TongHaiMaTran {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số dòng ma trận 1: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập số cột ma trận 1: ");
        int col = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời nhập số dòng ma trận 2: ");
        int row2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập số cột ma trận 2 ");
        int col2 = Integer.parseInt(scanner.nextLine());

        if(row<1 || row2<1 || col<1 || col2<1){
            System.out.println("Xin mời nhập lại");
            return;
        }

        if(row!=row2 || col!=col2){
            System.out.println("2 ma trận không bằng nhau");
            return;
        }

        int [][]array = new int[row][col];
        int [][]array2 = new int[row][col];
        int [][]arraySum = new int[row][col];


        System.out.println("-----Nhập Ma Trận 1-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Mời nhập a["+i+"]["+j+"]: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("---- Ma Trận 1-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("----Nhập Ma Trận 2-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Mời nhập a["+i+"]["+j+"]: ");
                array2[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("----Ma Trận 2-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arraySum[i][j] = array[i][j]+array2[i][j];
            }
        }
        System.out.println("-----Tổng 2 Ma Trận-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arraySum[i][j]+"\t");;
            }
            System.out.println();
        }

    }
}
