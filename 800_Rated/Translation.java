import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = scanner.nextLine();
        boolean result = isTranslationPossible(input, reversed);
        if (result) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isTranslationPossible(String s, String rev) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();

        return (rev.equals(reversed));
    }
}
