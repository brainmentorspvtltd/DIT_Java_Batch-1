public class P6_MCP {

    static int mcp(int cost[][], int m, int n) {
        if(m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        else if(m == 0 && n == 0) {
            return cost[m][n];
        }
        else {
            return cost[m][n] + Math.min(Math.min(mcp(cost, m-1, n-1), 
            mcp(cost, m-1, n)), mcp(cost, m, n-1));
        }
    }

    static int mcpTabulation(int cost[][], int m, int n) {
        int result[][] = new int[m][n];
        result[0][0] = cost[0][0];
        for(int i = 1; i < n; i++) {
            result[i][0] = result[i-1][0] + cost[i][0];
        }
        for(int i = 1; i < m; i++) {
            result[0][i] = result[0][i-1] + cost[0][i];
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                result[i][j] = Math.min(Math.min(result[i-1][j-1],
                 result[i-1][j]), result[i][j-1]) + cost[i][j];
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
        return result[m-1][n-1];
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {2,0,6},
            {3,1,7},
            {4,5,9}
        };
        // System.out.println(mcp(matrix, 2, 2));
        System.out.println(mcpTabulation(matrix, 3, 3));
    }
}
