package dsa.solutions.flipkart;

public class MaxFallingSum {
    public static int maxFallingSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a DP array initialized with the first row of the matrix
        int[][] dp = new int[n][m];
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int left = (j > 0) ? dp[i - 1][j - 1] : Integer.MIN_VALUE;
                int up = dp[i - 1][j];
                int right = (j < m - 1) ? dp[i - 1][j + 1] : Integer.MIN_VALUE;
                dp[i][j] = matrix[i][j] + Math.max(up, Math.max(left, right));
            }
        }

        // Find the maximum value in the last row
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxSum = Math.max(maxSum, dp[n - 1][j]);
        }

        return maxSum;
    }
}

