import java.util.*;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().toUpperCase();
        String winner = findWinner(n, s);
        System.out.println(winner);
    }

    public static String findWinner(int n, String s) {
        int antonWins = 0, danikWins = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') antonWins++;
            else danikWins++;
        }

        if (antonWins > danikWins) return "Anton";
        else if (antonWins == danikWins) return "Friendship";
        else return "Danik";
    }
}
