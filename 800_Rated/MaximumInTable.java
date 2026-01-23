import java.util.*;

public class MaximumInTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxi = findMaximum(n);
        System.out.println(maxi);
    }

    public static int findMaximum(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) res[i][j] = 1;
                else res[i][j] = res[i - 1][j] + res[i][j - 1];
            }
        }
        return res[n - 1][n - 1];
    }
}
