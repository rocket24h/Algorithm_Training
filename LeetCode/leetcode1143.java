import java.util.Arrays;

public class leetcode1143 {
    public static void main(String args[]){
        System.out.println(longestCommonSubsequenceFunc("abcde", "ace"));
        System.out.println(longestCommonSubsequenceFunc("abc", "abc"));
        System.out.println(longestCommonSubsequenceFunc("abc", "def"));
    }

    public static int longestCommonSubsequenceFunc(String text1, String text2){
        int n = text1.length(), m = text2.length();
        int[][] arr = new int[n + 1][m + 1];
        for (int i = n - 1; i >= 0; i--){
            for (int j = m - 1; j >= 0; j--){
                if(text1.charAt(i) == text2.charAt(j))
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
        return arr[0][0];
    }
    
}
