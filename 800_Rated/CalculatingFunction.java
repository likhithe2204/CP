import java.util.*;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ans = function(n);
        System.out.println(ans);
    }

    public static int function(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans -= i;
            } else {
                ans += i;
            }
        }

        return ans;
    }
}
