import java.util.*;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine().toLowerCase();
            System.out.println(abbreviation(s));
        }
    }

    public static String abbreviation(String s) {
        int n = s.length(), i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        while (i < n - 1) {
            if (s.charAt(i) == ' ') {
                i++;
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
