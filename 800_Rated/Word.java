import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result = correctedWord(word);
        System.out.println(result);
    }

    public static String correctedWord(String s) {
        int cntUpperCase = 0, cntLowerCase = 0;

        for (char ch : s.toCharArray()) {
            int val = ch;                                   // convert to ASCII
            if (val >= 65 && val <= 90) cntUpperCase++;     // ASCII values of 'A' -> 'Z' (65 - 90).
            else cntLowerCase++;                            // ASCII values of 'a' -> 'z' (97 - 122).
        }

        return (cntUpperCase > cntLowerCase) ? s.toUpperCase() : s.toLowerCase();
    }
}
