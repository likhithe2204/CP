import java.util.*;

public class APLUSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();

            int ans = findSum(s);
            System.out.println(ans);
        }
    }

    public static int findSum(String input) {
        return input.charAt(0) - '0' + input.charAt(2) - '0';
    }
}
