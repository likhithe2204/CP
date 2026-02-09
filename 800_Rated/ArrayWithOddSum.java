import java.util.*;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean res = isOddSum(n, arr);
            if (res) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isOddSum(int n, int[] arr) {
        int sum = 0, odd = 0, even = 0;
        for (int x : arr) {
            sum += x;
            if (x % 2 == 0) even++;
            else odd++;
        }
        // Possible if sum already odd, or both odd & even exist
        return sum % 2 == 1 || (odd > 0 && even > 0);
    }
}
