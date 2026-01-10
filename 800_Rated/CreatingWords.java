import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String a = scanner.next().toLowerCase();
            String b = scanner.next().toLowerCase();

            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            char temp = ch1[0];
            ch1[0] = ch2[0];
            ch2[0] = temp;

            String A = new String(ch1);
            String B = new String(ch2);
            System.out.println(A + " " + B);
        }
    }
}
