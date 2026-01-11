import java.util.*;

public class StairPeakNeither {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (isStair(a, b, c)) System.out.println("STAIR");
            else if (isPeak(a, b, c)) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }

    public static boolean isStair(int a, int b, int c) {
        return (a < b && b < c);
    }

    public static boolean isPeak(int a, int b, int c) {
        return (a < b && b > c);
    }
}
