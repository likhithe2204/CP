import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int ans = maxConsecutiveZeroes(n, arr);
            System.out.println(ans);
        }
    }

    public static int maxConsecutiveZeroes(int n, int[] arr) {
        int cnt = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) cnt = 0;
            else cnt++;
            max = Math.max(max, cnt);
        }
        return max;
    }
}
