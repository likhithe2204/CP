import java.util.*;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = capitalizeFirstLetter(input);
        System.out.println(result);
    }

    public static String capitalizeFirstLetter(String s) {
        StringBuilder sb = new StringBuilder(s);
        char first_letter = Character.toUpperCase(sb.charAt(0));
        sb.setCharAt(0, first_letter);
        return sb.toString();
    }
}
