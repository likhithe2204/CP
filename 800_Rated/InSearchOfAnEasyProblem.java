import java.util.*;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = scanner.nextInt();
        int[] opinions = new int[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            opinions[i] = scanner.nextInt();
        }

        String ans = findProblemLevel(numOfPeople, opinions);
        System.out.println(ans);
    }

    public static String findProblemLevel(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) return "HARD";
        }
        return "EASY";
    }
}
