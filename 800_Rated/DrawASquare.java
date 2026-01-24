import java.util.*;

public class DrawASquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int d = scanner.nextInt();
            int u = scanner.nextInt();

            if (isSquare(l, r, d, u)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isSquare(int a, int b, int c, int d) {
        return (a == b && b == c && c == d);
    }
}
