import java.util.*;

public class NotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String l1 = scanner.nextLine();
            String l2 = scanner.nextLine();
            String l3 = scanner.nextLine();

            System.out.println(findMissingChar(l1, l2, l3));
        }
    }

    public static char findMissingChar(String l1, String l2, String l3) {
        char[] s1 = l1.toCharArray();
        char[] s2 = l2.toCharArray();
        char[] s3 = l3.toCharArray();

        int cntA = 0, cntB = 0, cntC = 0;

        for (char ch : s1) {
            if (ch == 'A') cntA++;
            else if (ch == 'B') cntB++;
            else if (ch == 'C') cntC++;
        }

        for (char ch : s2) {
            if (ch == 'A') cntA++;
            else if (ch == 'B') cntB++;
            else if (ch == 'C') cntC++;
        }

        for (char ch : s3) {
            if (ch == 'A') cntA++;
            else if (ch == 'B') cntB++;
            else if (ch == 'C') cntC++;
        }

        if (cntA == 2) return 'A';
        else if (cntB == 2) return 'B';
        else if (cntC == 2) return 'C';

        return 0;
    }
}
