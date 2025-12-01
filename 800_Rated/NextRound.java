import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // # of participants
        int k = scanner.nextInt(); // score of the Kth participant

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int result = countQualifiers(scores, n, k);
        System.out.println(result);
    }

    public static int countQualifiers(int[] scores, int n, int k) {
        // 1. Find the score of K-th participant
        // 2. Count all the scores which are at-least K-th participant score or greater
        //    AND a positive score as well (>0).

        int targetScore = scores[k - 1]; // codeforces is always "1-based indexing"
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= targetScore && scores[i] > 0) {
                count++; // add to the counter.
            }
        }
        return count;
    }
}
