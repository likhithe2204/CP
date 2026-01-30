import java.util.*;

public class CPlusEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = findOperations(a, b, n);
            System.out.println(result);
        }
    }

    public static int findOperations(int a, int b, int n) {
        int cnt = 0;
        while (a <= n && b <= n) {
            if (a < b) {
                a += b;
            } else {
                b += a;
            }
            cnt++;
        }
        return cnt;
    }
}
