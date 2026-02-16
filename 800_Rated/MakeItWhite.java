import java.util.*;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next().toUpperCase();

            System.out.println(maximumContinuousWhiteCells(n, s));
        }
    }

    public static int maximumContinuousWhiteCells(int n, String s) {
        int left = 0, right = n - 1;

        while (left < n && s.charAt(left) != 'B') {
            left++;
        }
        while (right >= 0 && s.charAt(right) != 'B') {
            right--;
        }

        return Math.abs(right - left) + 1;
    }
}
