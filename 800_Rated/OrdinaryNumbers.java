import java.util.*;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(totalOrdinaryNumbers(n));
        }
    }

    public static long totalOrdinaryNumbers(long n) {
        long count = 0;

        for (int len = 1; len <= 10; len++) {
            for (int d = 1; d <= 9; d++) {
                long num = buildNumber(d, len);
                if (num <= n) count++;
            }
        }

        return count;
    }

    public static long buildNumber(int digit, int length) {
        long num = 0;
        for (int i = 0; i < length; i++) {
            num = num * 10 + digit;
        }
        return num;
    }
}
