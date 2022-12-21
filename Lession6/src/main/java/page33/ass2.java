package page33;

public class ass2 {
    public static void main(String[] args) {
        int n = 0;
        int s = 0;
        while (s < 10000) {
            n += 1;
            s = s + n;
        }
        System.out.println(n);
    }
}
