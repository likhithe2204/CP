import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        boolean ans = isNearlyLuckyNumber(n);
        if (ans) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isNearlyLuckyNumber(long n) {
        int cnt = 0;
        String s = String.valueOf(n); // convert the num to string

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '4' || ch == '7') cnt++;
        }

        return (cnt == 4 || cnt == 7);
    }
}
