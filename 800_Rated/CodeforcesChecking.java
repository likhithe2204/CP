import java.util.*;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            char c = scanner.next().charAt(0);
            if (doesAppear(c)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean doesAppear(Character input) {
        char[] arr = "codeforces".toCharArray();
        for (char ch : arr) {
            if (ch == input) return true;
        }
        return false;
    }
}
