import java.util.*;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long ans = function(n);
        System.out.println(ans);
    }

    public static long function(long n) {
        long ans = 0;

        if (n % 2 == 0) {
            ans += (n / 2);
        } else {
            ans -= ((n + 1) / 2);
        }

        return ans;
    }
}
