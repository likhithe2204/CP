import java.util.*;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
