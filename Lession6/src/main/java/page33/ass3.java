package page33;

import java.util.Scanner;

public class ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s = 0;
        do {
            System.out.print("Nhập số nguyên dương n : ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1) {
                    s += i;
                }
            }
        } while (n < 0);
        System.out.println("Tổng : " + s);
    }
}
