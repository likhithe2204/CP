import java.util.*;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(minCostToBuyYogurts(n, a, b));
        }
    }

    public static int minCostToBuyYogurts(int n, int a, int b) {
        int val1 = 0, val2 = 0;
        val1 = a * n;
        if (n % 2 == 0) {
            val2 = (n / 2) * b;
        } else {
            val2 = ((n / 2) * b) + a;
        }

        return Math.min(val1, val2);
    }
}
