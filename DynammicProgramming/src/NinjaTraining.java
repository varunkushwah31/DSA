import java.util.*;

public class NinjaTraining {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Test Case 1
        int[][] matrix1 = {
                {20, 10, 10},
                {20, 10, 10},
                {20, 30, 10}
        };
        System.out.println("Output: " + ninjaTraining(matrix1));
        // Output: 70

        // Test Case 2
        int[][] matrix2 = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        System.out.println("Output: " + ninjaTraining(matrix2));
        // Output: 210

        // Test Case 3
        int[][] matrix3 = {
                {70, 40, 10},
                {180, 20, 5},
                {200, 60, 30}
        };
        System.out.println("Output: " + ninjaTraining(matrix3));
        // Output: 290

        // Test Case 4
        int[][] matrix4 = {
                {1, 2, 3}
        };
        System.out.println("Output: " + ninjaTraining(matrix4));
        // Output: 3

        // Test Case 5
        int[][] matrix5 = {
                {5, 10, 15},
                {10, 5, 20}
        };
        System.out.println("Output: " + ninjaTraining(matrix5));
        // Output: 30

        read.close();
    }
    private static int  ninjaTraining(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][3];
        dp[0][0] = matrix[0][0];
        dp[0][1] = matrix[0][1];
        dp[0][2] = matrix[0][2];
        for(int i = 1; i < n; i++) {
            dp[i][0] = matrix[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = matrix[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = matrix[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
    }
}