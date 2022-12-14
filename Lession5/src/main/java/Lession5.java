import java.util.Scanner;

public class Lession5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luckyNumber = (int) (Math.random() * 999 + 1);
//        System.out.println(luckyNumber);
        boolean check = true;
        do {
            System.out.print("Nhập số mà bạn muốn đoán : ");
            int n = sc.nextInt();
            if(n > luckyNumber) {
                System.out.println("Số bạn nhập đã lớn hơn số cần tìm ");
                check = true;
            } else if ( n < luckyNumber) {
                System.out.println("Số bạn nhập đã nhỏ hơn số cần tìm ");
                check = true;
            } else {
                System.out.println("Chúc mừng bạn đã đoán đúng số cần tìm .");
                check = false;
            }
        } while (check);
    }
}
