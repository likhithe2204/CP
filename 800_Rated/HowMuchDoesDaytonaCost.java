import java.util.*;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean ans = isSubsegmentExists(n, k, arr);
            if (ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isSubsegmentExists(int n, int k, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }
}
