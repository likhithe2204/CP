import java.util.*;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine().toLowerCase();
            System.out.println(mirrorOutput(input));
        }
    }

    public static String mirrorOutput(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == 'p') ch = 'q';
            else if (ch == 'q') ch = 'p';
            sb.append(ch);
        }
        return sb.toString();
    }
}
