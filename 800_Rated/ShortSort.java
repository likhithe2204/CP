import java.util.*;

public class ShortSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String input = scanner.next();

            if (isABCAfterSwap(input)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isABCAfterSwap(String s) {
        char[] arr = s.toCharArray();
        return (arr[0] == 'a' || arr[1] == 'b' || arr[2] == 'c');
    }
}
