import java.util.*;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfChildren = scanner.nextInt();
        int time = scanner.nextInt();
        scanner.nextLine();
        String arrangement = scanner.nextLine();

        String result = finalArrangement(numOfChildren, time, arrangement);
        System.out.println(result);
    }

    public static String finalArrangement(int n, int t, String s) {
        char[] arr = s.toCharArray();

        while (t != 0) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // swap both of them
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    // to avoid double swapping, skip the next index
                    i++;
                }
            }
            t--;
        }
        return new String(arr);
    }
}
