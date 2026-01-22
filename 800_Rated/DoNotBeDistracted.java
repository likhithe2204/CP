import java.util.*;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            if (isSus(n, s)) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    public static boolean isSus(int n, String s) {
        HashSet<Character> seen = new HashSet<>();
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur != prev) {
                seen.add(prev);
                if (seen.contains(cur)) return true;
            }

            prev = cur;
        }

        return false;
    }
}
