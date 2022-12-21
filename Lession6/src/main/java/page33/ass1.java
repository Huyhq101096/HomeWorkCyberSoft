package page33;

import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choose;
        int personWin = 0;
        int machineWin = 0;
        do {
            int numberRandom = (int) (Math.random() * 3 + 1);
//            System.out.println(numberRandom);
            System.out.println("chọn số mà bạn muốn ra : 1.Kéo 2.Búa 3.Bao 0.kết thúc");
            int choosePerson = sc.nextInt();
            if (choosePerson == 1) {
                if (numberRandom == 1) {
                    System.out.println("Cả hai đều chọn kéo . Hòa nhau !!!");
                } else if (numberRandom == 2) {
                    System.out.println("Máy chọn búa . Bạn chọn kéo . Bạn đã thua !!!");
                    machineWin += 1;
                } else {
                    System.out.println("Máy chọn bao . Bạn chọn kéo . Bạn đã thắng !!!");
                    personWin += 1;
                }
            } else if (choosePerson == 2) {
                if (numberRandom == 1) {
                    System.out.println("Máy chọn Kéo . Bạn chọn búa . Bạn đã thắng !!!");
                    personWin += 1;
                } else if (numberRandom == 2) {
                    System.out.println("Cả hai đều chọn búa . Hòa nhau !!!");
                } else {
                    System.out.println("Máy chọn bao . Bạn chọn búa . Bạn đã thua !!!");
                    machineWin += 1;
                }
            } else if (choosePerson == 3) {
                if (numberRandom == 1) {
                    System.out.println("Máy chọn Kéo . Bạn chọn Bao . Bạn đã thua !!!");
                    machineWin += 1;
                } else if (numberRandom == 2) {
                    System.out.println("Máy chọn Búa . Bạn chọn Bao . Bạn đã thắng !!!");
                    personWin += 1;
                } else {
                    System.out.println("Máy chọn Bao . Bạn chọn Bao . Hòa nhau !!!");
                }
            }

            System.out.println("Bạn muốn chơi tiếp không ? Nhấp số bất kì để chơi tiếp . Nhấn 0 để thoát ra ");
            choose = sc.nextInt();
        } while (choose != 0);

        if (personWin > machineWin) {
            System.out.println("Bạn đã thắng . Tỉ số là : Bạn : " + personWin + " ; Máy là " + machineWin);
        } else if (personWin < machineWin) {
            System.out.println("Bạn đã thua . Tỉ số là : Máy : " + machineWin + " ; Bạn là " + personWin);
        } else {
            System.out.println("Bạn và máy đã hòa nhau .");
        }

    }
}
