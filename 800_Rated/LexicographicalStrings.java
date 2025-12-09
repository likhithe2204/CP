import java.util.*;

public class LexicographicalStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int result = compareLexicographically(s1, s2);
        System.out.println(result);
    }

    public static int compareLexicographically(String s1, String s2) {
        // use compareTo() method:
        int ans = s1.compareToIgnoreCase(s2);
        if (ans < 0) return -1;
        else if (ans > 0) return 1;
        return 0; // if s1 == s2
    }
}
