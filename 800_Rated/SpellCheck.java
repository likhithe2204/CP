import java.util.*;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            boolean ans = isCorrectSpell(n, s);
            if (ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isCorrectSpell(int n, String s) {
        if (n != 5) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.size() != 5) return false;

        return map.getOrDefault('T', 0) == 1 &&
                map.getOrDefault('i', 0) == 1 &&
                map.getOrDefault('m', 0) == 1 &&
                map.getOrDefault('u', 0) == 1 &&
                map.getOrDefault('r', 0) == 1;
    }
}
