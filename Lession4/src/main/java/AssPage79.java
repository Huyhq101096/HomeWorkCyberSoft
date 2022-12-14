import java.util.Scanner;

public class AssPage79 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        String name = sc.nextLine();
        System.out.print("Tong thu nhap trong mot nam : ");
        double totalMoneyInYear = sc.nextDouble();
        while (totalMoneyInYear <= 0) {
            System.out.print("Số tiền phải lớn hơn 0 . Hãy nhập lại số tiền : ");
            totalMoneyInYear = sc.nextDouble();
        }

        System.out.print("Nhap so nguoi phu thuoc : ");
        int number = sc.nextInt();

        double incomeTaxes = totalMoneyInYear - 4000000 - 1600000 * number;

        if (incomeTaxes == 60000000) {
            System.out.println("Thuế suất : 5% ");
            System.out.printf("Số tiền thuế phải đóng là  : %.2f ", incomeTaxes * 0.05);
        } else if (incomeTaxes > 60000000 && incomeTaxes <= 120000000) {
            System.out.println("Thuế suất : 10% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f ", incomeTaxes * 0.1);
        } else if (incomeTaxes > 120000000 && incomeTaxes <= 210000000) {
            System.out.println("Thuế suất : 15% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f ", incomeTaxes * 0.15);
        } else if (incomeTaxes > 210000000 && incomeTaxes <= 384000000) {
            System.out.println("Thuế suất : 20% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f ", incomeTaxes * 0.2);
        } else if (incomeTaxes > 384000000 && incomeTaxes <= 624000000) {
            System.out.println("Thuế suất : 25% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f", incomeTaxes * 0.25);
        } else if (incomeTaxes > 624000000 && incomeTaxes <= 960000000) {
            System.out.println("Thuế suất : 30% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f ", incomeTaxes * 0.3);
        } else if (incomeTaxes > 960000000) {
            System.out.println("Thuế suất : 35% ");
            System.out.printf("Số tiền thuế phải đóng là : %.2f ", incomeTaxes * 0.35);
        } else {
            System.out.println("Bạn không cần phải đóng thuế thu nhập cá nhân .");
        }

    }
}
