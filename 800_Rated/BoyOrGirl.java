import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = countDistinctCharacters(s);
        if (result == 0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }

    public static int countDistinctCharacters(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }

        return (set.size() % 2 == 0) ? 1 : 0;
    }
}
