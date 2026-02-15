import java.util.*;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(getMinOfDigit(n));
        }
    }

    public static int getMinOfDigit(int n) {
        int mini = Integer.MAX_VALUE;
        while (n != 0) {
            int rem = n % 10;
            mini = Math.min(mini, rem);
            n = n / 10;
        }

        return mini;
    }
}
