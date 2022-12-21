package page33;

import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;

        System.out.print("Số tiền mà anh có : ");
        double nowMoney = sc.nextDouble();
        System.out.print("Số tền đạt được sau một năm :");
        double hopeMoney = sc.nextDouble();

        System.out.println("Lãi là bao nhiêu phần trăm trên 1 năm :  ");
        double fee = sc.nextDouble();
        //lãi suất gửi trên một năm .
        fee = 1 + fee / 100;

        //công thức tính .
        while (nowMoney < hopeMoney) {
            nowMoney = nowMoney * fee;
            year++;
        }

        System.out.println("Số năm bạn cần để đạt được mục tiêu là : " + year + " năm");
    }
}
