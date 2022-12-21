package page33;

import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị x : ");
        int x = sc.nextInt();
        System.out.print("Nhập giá trị n : ");
        int n = sc.nextInt();
        caculate(x, n);
        caculate2(x, n);

    }

    public static void caculate(int x, int n) {
        int s = 0;
        int a = x;
        if (n == 0) {
            s = 1;
        } else if (n == 1) {
            s = 1 + x;
        } else {
            s = 1 + x;
            for (int i = 2; i <= n; i++) {
                x = x * a;
                s = s + x;
            }
        }
        System.out.println(s);
    }

    public static void caculate2(int x, int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += Math.pow(x, i);
        }
        System.out.println(s);
    }


}
