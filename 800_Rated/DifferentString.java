import java.util.*;

public class DifferentString {

    public static boolean isDiffStr(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map.size() > 1;  // at least 2 unique characters
    }

    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static String sortedString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume a new line

        while (t-- > 0) {
            String input = scanner.nextLine().toLowerCase();

            if (isDiffStr(input)) {
                System.out.println("YES");
                String reversed = reverseString(input);

                if (reversed.equals(input)) {
                    // Case when input is palindrome like "aba"
                    System.out.println(sortedString(input));
                } else {
                    System.out.println(reversed);
                }

            } else {
                System.out.println("NO");  // all characters same (e.g., "aaaaa")
            }
        }
    }
}
