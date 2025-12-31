import java.util.*;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String result = findXOR(line1, line2);
        System.out.println(result);
    }

    public static String findXOR(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) sb.append('0');
            else sb.append('1');
        }

        return sb.toString();
    }
}
