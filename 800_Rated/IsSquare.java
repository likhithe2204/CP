import java.util.*;

public class IsSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (isASquare(a, b, c, d)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isASquare(int a, int b, int c, int d) {
        return (a == b && b == c && c == d);
    }
}
