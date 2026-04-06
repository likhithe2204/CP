import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n1 = scanner.nextInt(); // length of s1
            scanner.nextLine(); // consume a new line
            String s1 = scanner.nextLine().toLowerCase(); // string s1

            int n2 = scanner.nextInt(); // lengths of s2 & s3
            scanner.nextLine(); // consume a new line
            String s2 = scanner.nextLine().toLowerCase(); // string s2

            String s3 = scanner.nextLine(); // string s1

            System.out.println(stringFunctions(n1, s1, n2, s2, s3));
        }
    }

    public static String stringFunctions(int len_a, String a, int len_bc, String b, String c) {
        int ptr1 = 0, ptr2 = 0;
        String ans = a;
        while (ptr1 != len_bc) {
            if (c.charAt(ptr1) == 'D') {
                ans = ans + String.valueOf(b.charAt(ptr2));
            } else {
                ans = String.valueOf(b.charAt(ptr2)) + ans;
            }
            ptr1++;
            ptr2++;
        }
        return ans;
    }
}
