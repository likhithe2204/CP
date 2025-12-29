import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String table = scanner.nextLine().toUpperCase();

        int result = minStonesToRemove(n, table);
        System.out.println(result);
    }

    public static int minStonesToRemove(int n, String s) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) ans++;
        }
        return ans;
    }
}
