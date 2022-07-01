public class P4_LCS {

    static int lcs(String first, String second) {
        // Input string is empty...
        if(first.length() == 0 || second.length() == 0) {
            return 0;
        }

        int count = 0;
        if(first.charAt(0) == second.charAt(0)) {
            count = 1 + lcs(first.substring(1), second.substring(1));
        }
        else {
            int result_1 = lcs(first.substring(1), second);
            int result_2 = lcs(first, second.substring(1));
            count = Math.max(result_1, result_2);
        }
        return count;
    }

    static int lcsMemoization(String X, String Y, int m, int n, int cache[][]) {
        // Base Case
        if(m == 0 || n == 0) {
            return 0;
        }

        // if same state has been already computed
        if(cache[m-1][n-1] != 0) {
            return cache[m-1][n-1];
        }

        if(X.charAt(m-1) == Y.charAt(n-1)) {
            cache[m-1][n-1] = 1 + lcsMemoization(X, Y, m-1, n-1, cache);
            return cache[m-1][n-1];
        }

        else {
            cache[m-1][n-1] = Math.max(lcsMemoization(X, Y, m, n-1, cache),
            lcsMemoization(X, Y, m-1, n, cache));
            return cache[m-1][n-1];
        }
    }

    static int lcsTabulation(String first, String second, int m, int n) {
        int matrix[][] = new int[m+1][n+1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 0;
                }
                else if(first.charAt(i-1) == second.charAt(j-1)) {
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }
                else {
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "aidefgh";
        // int count = lcs(s1, s2);
        // System.out.println(count);
        int m = s1.length(), n = s2.length();
        int cache[][] = new int[m+1][n+1];
        int count = lcsMemoization(s1, s2, m, n, cache);
        System.out.println(count);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(cache[i][j] + ",");
            }
            System.out.println();
        }
    }
}