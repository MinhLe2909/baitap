package BTVN_Buoi3;

import java.util.Scanner;

public class BTVN_Buoi3_p2 {
    public static void main(String[] args) {
        Scanner sanncer = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên: ");
        int n = sanncer.nextInt();

        if(n<0){
            System.out.println("Mời bạn nhập lại số khác");
        }else {
            int sum=0;
            for (int i = 0; i <=n ; i++) {
                if(i%2==0){
                    sum = sum + i;
                }
            }
            System.out.println("Tổng số chẵn = "+sum );

        }
    }
}
