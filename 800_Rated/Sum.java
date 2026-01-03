import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b == c || b + c == a || c + a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
