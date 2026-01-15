import java.util.*;

public class SquareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine();

            boolean ans = isSquareString(input);
            if (ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isSquareString(String s) {
        int n = s.length();
        if (n % 2 == 1) return false; // odd length string

        int i = 0, j = n / 2;
        while (i < n / 2 && j < n) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j++;
            i++;
        }
        return true;
    }
}
