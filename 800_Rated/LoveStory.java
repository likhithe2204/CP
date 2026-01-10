import java.util.*;

public class LoveStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String input = scanner.next().toLowerCase();

            int diff = cntMismatchedIndices(input);
            System.out.println(diff);
        }
    }

    public static int cntMismatchedIndices(String s) {
        char[] cf = "codeforces".toCharArray();
        char[] input = s.toCharArray();
        int i = 0, j = 0, cnt = 0;

        while (i < cf.length && j < input.length) {
            if (cf[i] != input[j]) cnt++;
            i++;
            j++;
        }

        return cnt;
    }
}
