import java.util.*;

public class RudolfAndTheTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] b = new int[n];
            int[] c = new int[m];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                c[i] = scanner.nextInt();
            }

            System.out.println(findDenominationsSumLessThanK(n, m, k, b, c));
        }
    }

    public static int findDenominationsSumLessThanK(int n, int m, int k, int[] b, int[] c) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = b[i] + c[j];
                if (sum <= k) cnt++;
            }
        }
        return cnt;
    }
}
