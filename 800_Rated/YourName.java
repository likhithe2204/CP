import java.util.*;

public class YourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next().toLowerCase();
            String t = scanner.next().toLowerCase();

            if (isPossibleRearrangement(n, s, t)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isPossibleRearrangement(int n, String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String S = new String(arr1);
        String T = new String(arr2);

        return (S.equals(T));
    }
}
