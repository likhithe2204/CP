import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();          // # of test cases
        scanner.nextLine();                 // consume the leftover new line

        String[] words = new String[t];

        for(int i = 0; i < t; i++) {
            words[i] = scanner.nextLine();  // keep on taking the input
        }

        String[] result = findAbbreviation(words);
        for(String word : result){
            System.out.println(word);
        }
    }
    public static String[] findAbbreviation(String[] words){
        int n = words.length;
        String[] ans = new String[n];
        int ind = 0;

        for(String word : words){
            if(word.length() <= 10){
                // No change required.
                ans[ind] = word;
            }
            else{
                // Keep the first and last character of the word as same
                // Count the # chars b/w first and last and place that decimal in b/w.

                // first char + (length - 2) + last char
                ans[ind] = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length()-1);
            }
            ind++;
        }
        return ans;
    }
}
