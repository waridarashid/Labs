import java.util.Stack;

/**
 * Created by Warida Rashid on 10 Nov 2015.
 */
public class LCS {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int m = str1.length;
        int n = str2.length;
        int[][] lcs = new int[m + 1][n + 1];
        Stack printLcs = new Stack();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (str1[i-1] == str2[j-1]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    if (lcs[i - 1][j] > lcs[i][j - 1]) {
                        lcs[i][j] = lcs[i - 1][j];
                    } else {
                        lcs[i][j] = lcs[i][j - 1];
                    }
                }
            }
        }

        for (int i=0; i<m+1; i++){
            for (int j=0; j<n+1; j++){
                System.out.print(lcs[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        int i = m;
        int j = n;

        while (i > 0 && j >0){
            if (str1[i-1] == str2[j-1]){
                printLcs.push(str1[i-1]);
                i = i-1;
                j = j-1;
            }
            else if (lcs[i-1][j] > lcs[i][j-1]){
                i--;
            }
            else {
                j--;
            }
        }
        System.out.println("Longest common subsequesnce:");
        while (!printLcs.isEmpty()){
            System.out.print(printLcs.pop());
        }


    }
}
