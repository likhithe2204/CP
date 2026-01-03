import java.util.*;

public class YESorYES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine();
            if (isYES(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isYES(String s) {
        return s.equalsIgnoreCase("YES");
    }
}
