import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine().toLowerCase();

        boolean result = isPangram(n, input);
        if (result) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isPangram(int n, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return (map.size() == 26);
    }
}
