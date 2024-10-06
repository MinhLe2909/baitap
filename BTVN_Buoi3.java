package BTVN_Buoi3;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class BTVN_Buoi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên: ");
        int n = scanner.nextInt();
        if (n<=0)
        {
            System.out.println("Mời bạn nhập lại số khác");
        }
        else {
            int mul = 1;
            for (int i = 2; i <= n; i++) {
                mul = mul * i;
            }
            System.out.println("Tích các số từ 1 đến số bạn vừa nhập = "+ mul);
        }
    }
}
