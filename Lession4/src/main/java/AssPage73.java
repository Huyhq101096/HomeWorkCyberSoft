import java.util.Scanner;

public class AssPage73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chon loai grap");
        System.out.println("1.GrapCar");
        System.out.println("2.Grap SUV");
        System.out.println("3.GrabBlack");
        int choose = sc.nextInt();


        System.out.println("Nhap km da di duoc : ");
        double km = sc.nextDouble();
        System.out.println("Nhap thoi gian cho cua khach : ");
        int wait = sc.nextInt();
        double money = 0;
        caculate(choose, km, wait, money);

    }

    public static double caculate(int n, double km, int wait, double money) {
        switch (n) {
            case 1:
                if (km >= 0 && km <= 1) {
                    money = 8000 + (wait / 3) * 2000;
                } else if (km <= 19) {
                    money = 8000 + (km - 1) * 7500 + (wait / 3) * 2000;
                } else {
                    money = 8000 + 18 * 7500 + (km - 19) * 7000 + (wait / 3) * 2000;
                }
                break;
            case 2:
                if (km >= 0 && km <= 1) {
                    money = 9000 + (wait / 3) * 3000;
                } else if (km <= 19) {
                    money = 9000 + (km - 1) * 8500 + (wait / 3) * 2000;
                } else {
                    money = 9000 + 18 * 8500 + (km - 19) * 8000 + (wait / 3) * 3000;
                }
                break;
            case 3:
                if (km >= 0 && km <= 1) {
                    money = 10000 + (wait / 3) * 3500;
                } else if (km <= 19) {
                    money = 10000 + (km - 1) * 9500 + (wait / 3) * 3500;
                } else {
                    money = 10000 + 18 * 9500 + (km - 19) * 9000 + (wait / 3) * 3500;
                }
                break;
            default:
                System.out.println("Nhap sai xe . Ket thuc chuong trinh");
                break;
        }
        System.out.println("tong tien cua bn la : " + money);
        return money;
    }

}
