import java.util.*;

public class Team {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // # problems in the contest
        int[][] mat = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        int result = countOnes(mat, n);
        System.out.println(result);
    }
    public static int countOnes(int[][] mat, int n){
        // check row wise, (>= 2) 1's -> add to the ans
        int ans = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0; // keep a tracker for each row to check # 1's
            for(int j = 0; j < 3; j++){
                if(mat[i][j] == 1){
                    cnt++;
                    if(cnt >= 2){
                        ans++;
                        break; // single occurrence is enough.
                    }
                }

            }
        }
        return ans;
    }
}
