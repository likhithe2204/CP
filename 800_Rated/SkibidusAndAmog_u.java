import java.util.*;

public class SkibidusAndAmog_u {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine().toLowerCase();

            System.out.println(convert2Plural(input));
        }
    }

    public static String convert2Plural(String s) {
        char[] arr = s.toCharArray();
        int indexToDelete = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'u') {
                indexToDelete = i;
                break;
            }
        }
        return s.substring(0, indexToDelete) + "i";
    }
}
