import java.util.*;

public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();

            char ans = findMostRepeatingChar(s);
            System.out.println(ans);
        }
    }

    public static char findMostRepeatingChar(String s) {
        int cntA = 0, cntB = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == 'A') cntA++;
            else cntB++;
        }
        return (cntA > cntB) ? 'A' : 'B';
    }
}
