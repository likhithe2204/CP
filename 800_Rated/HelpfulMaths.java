import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = rearrangeSum(input);
        System.out.println(result);
    }

    public static String rearrangeSum(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        if (n == 1) return s;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cntPlus = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') cnt1++;
            else if (ch == '2') cnt2++;
            else if (ch == '3') cnt3++;
            else if (ch == '+') cntPlus++;
        }

        while (cnt1 != 0) {
            sb.append('1');
            sb.append('+');
            cnt1--;
        }

        while (cnt2 != 0) {
            sb.append('2');
            sb.append('+');
            cnt2--;
        }

        while (cnt3 != 0) {
            sb.append('3');
            sb.append('+');
            cnt3--;
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
