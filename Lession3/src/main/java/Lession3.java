import java.util.Scanner;

public class Lession3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lession3 lession3 = new Lession3();
        boolean coutinue = true;
        do {
            lession3.menu();
            int n = scanner.nextInt();
            while (n < 1 || n > 6) {
                lession3.menu();
                n = scanner.nextInt();
            }

            switch (n) {
                case 1:
                    lession3.ass1();
                    break;
                case 2:
                    lession3.ass2();
                    break;
                case 3:
                    lession3.ass3();
                    break;
                case 4:
                    lession3.ass4();
                    break;
                case 5:
                    lession3.ass5();
                    break;
                case 6:
                    coutinue = false;
                    break;
            }
        } while (coutinue);

    }

    public void menu() {
        System.out.println("Chọn bài tập mà bạn muốn kiểm tra");
        System.out.println("1.Ass1");
        System.out.println("2.Ass2");
        System.out.println("3.Ass3");
        System.out.println("4.Ass5");
        System.out.println("5.Ass6");
        System.out.println("6.Exit");
    }

    public void ass1() {
        System.out.println("Input two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);
    }

    public void ass2() {
        System.out.println("Input three number with different values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(c + "<" + b + "<" + a);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }
        }

        if (b > a && b > c) {
            if (a > c) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }
        }

        if (c > a && c > b) {
            if (a > b) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(a + " < " + b + " < " + c);
            }
        }

        if (a == b || a == c || c == a) {
            System.out.println("Hãy nhập 3 số khác nhau ");
        }


    }


    public void ass3() {
        int[] n = new int[2];

        System.out.println("Nhập 3 số khác nhau : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Bạn muốn sắp xếp theo thứ tự nào : 1.Nhỏ đến lớn 2. Lớn đến nhỏ");
        int choose = sc.nextInt();

        if (choose == 1) {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(c + "<" + b + "<" + a);
                } else {
                    System.out.println(b + "<" + c + "<" + a);
                }
            }
            if (b > a && b > c) {
                if (a > c) {
                    System.out.println(c + " < " + a + " < " + b);
                } else {
                    System.out.println(a + " < " + c + " < " + b);
                }
            }
            if (c > a && c > b) {
                if (a > b) {
                    System.out.println(b + " < " + a + " < " + c);
                } else {
                    System.out.println(a + " < " + b + " < " + c);
                }
            }

            if (a == b || a == c || c == a) {
                System.out.println("Hãy nhập 3 số khác nhau ");
            }

        }

        if (choose == 2) {

            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(a + "<" + b + "<" + c);
                } else {
                    System.out.println(a + "<" + c + "<" + b);
                }
            }
            if (b > a && b > c) {
                if (a > c) {
                    System.out.println(b + " < " + a + " < " + c);
                } else {
                    System.out.println(b + " < " + c + " < " + a);
                }
            }
            if (c > a && c > b) {
                if (a > b) {
                    System.out.println(c + " < " + a + " < " + b);
                } else {
                    System.out.println(c + " < " + b + " < " + a);
                }
            }

            if (a == b || a == c || c == a) {
                System.out.println("Hãy nhập 3 số khác nhau ");
            }
        }


    }

    public void ass4() {

        String[] numberArr = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.println("Nhập số có 2 chữ số : ");
        int number1 = sc.nextInt();
        while (number1 < 10 || number1 > 99) {
            System.out.println("Nhập lại số có 2 chữ số : ");
            number1 = sc.nextInt();
        }
        int a = number1 / 10;
        int b = number1 % 10;
        if (a == 1 && b == 0) {
            System.out.println("mười");
        } else if (a != 1 && b == 0) {
            System.out.println(numberArr[a] + " mươi ");
        } else {
            System.out.println(numberArr[a] + " mươi " + numberArr[b]);
        }
    }


    public void ass5() {

        System.out.println("Ai là người đang sử dụng máy ?");
        System.out.println("1.B");
        System.out.println("2.M");
        System.out.println("3.A");
        System.out.println("4.E");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("Xin chào Bố");
        } else if (choose == 2) {
            System.out.println("Xin chào Mẹ");
        } else if (choose == 3) {
            System.out.println("Xin chào Anh");
        } else if (choose == 4) {
            System.out.println("Xin chào Em");
        } else {
            System.out.println("Bạn đã chọn sai yêu cầu của đề bài");
        }


    }

    public static void swap(int a, int b) {
        int z;
        z = a;
        a = b;
        b = z;

    }


}
