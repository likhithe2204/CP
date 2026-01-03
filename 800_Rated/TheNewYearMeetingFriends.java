import java.util.*;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(Math.max(a, b), Math.max(b, c));
        int min = Math.min(Math.min(a, b), Math.min(b, c));

        System.out.println(Math.abs(max - min));
    }
}
