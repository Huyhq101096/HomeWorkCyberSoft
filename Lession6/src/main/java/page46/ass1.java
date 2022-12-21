package page46;

import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.print("Bạn muốn nhập bao nhiêu số : ");
        int m = sc.nextInt();
        while (m <= 0) {
            System.out.println("m phải lớn hơn 0 . Hãy nhập lại");
            m = sc.nextInt();
        }
        int[] n = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + " : ");
            int input = sc.nextInt();
            n[i] = input;
        }

        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int max = n[0];
                    int position = 0;
                    for (int i = 1; i < n.length; i++) {
                        if (max <= n[i]) {
                            max = n[i];
                            position = i;
                        }
                        System.out.println(max);
                    }
                    System.out.println("Số lớn nhất là : " + max + " Vị trí thứ : " + position);
                    break;
                case 2:
                    int a = 0;
                    for (int i = 0; i < n.length; i++) {
                        if (n[i] < 0) {
                            a = n[i];
                            System.out.println("Số âm đầu tiên trong mảng là : " + a + " Ở vị trí thứ : " + i);
                            break;
                        }
                    }
                    System.out.println("Mảng của bạn không có số âm");
                    break;
                case 3:
                    int p = 0;
                    int number = 0;
                    for (int i = 0; i < n.length; i++) {
                        if (n[i] < 0) {
                            number = n[i];
                            break;
                        }
                    }
                    if (number != 0) {
                        for (int i = 0; i < n.length; i++) {
                            if (n[i] < 0 && n[i] >= number) {
                                number = n[i];
                                p = i;
                            }
                        }
                        System.out.println("Số âm lớn nhất có trong mảng là : " + number + " ở vị trí thứ : " + p);
                    } else {
                        System.out.println("Mảng của bạn không có số âm nào");
                    }
                    break;
                case 4:
                    int total = 0;
                    for (int i = 0; i < n.length; i++) {
                        total += (n[i] >= 0 && n[i] % 2 == 0 ? n[i] : 0);
                    }
                    System.out.println("Tổng các số dương là : " + total);
                    break;

                case 5:
                    int count = 0;
                    for (int i = 0; i < n.length; i++) {
                        count += (n[i] < 0 ? 1 : 0);
                    }
                    System.out.println("Có tất cả " + count + " số âm có trong mảng. ");
                    break;
                case 6:
                    int result = 0;
                    for (int i = 0; i < n.length; i++) {
                        result += (n[i] < 0 ? n[i] : 0);
                    }
                    System.out.println("Tổng các số âm có trong mảng là " + result);
                    break;
                case 7:
                    System.out.print("Nhập số mà bạn muốn tìm kiếm : ");
                    int x = sc.nextInt();
                    for (int i = 0; i < n.length; i++) {
                        if (n[i] == x) {
                            System.out.println("Số bạn tìm kiếm có tồn tại và ở vị trí thứ : " + i);
                            break;
                        } else {
                            System.out.println("Số bạn tìm kiếm không tồn tại.");
                        }
                    }
                    break;
                default:
                    return;
            }
        } while (choose != 0);
    }

    public static void menu() {
        System.out.println("Chọn các chức năng dưới đây ");
        System.out.println("1.Tìm số lớn nhất và vị trí ở trong mảng ");
        System.out.println("2.Tìm vị trí số âm đầu tiên và vị trí trong mảng . ");
        System.out.println("3.Tìm số âm lớn nhất và vị trí trong mảng ");
        System.out.println("4.Tính tổng các số chẳn ");
        System.out.println("5.Đếm có bao nhiêu số âm. ");
        System.out.println("6.Tổng các số âm ");
        System.out.println("7.Nhập số x và tìm x có trong mảng hay không .");
        System.out.println("0.Exit ");
    }
}
