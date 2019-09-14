package leetcode;

//64矩阵的最小路径和
public class DTGH03 {
	public int minPathSum(int[][] grid) {
	    if (grid.length == 0 || grid[0].length == 0) {
	        return 0;
	    }
	    int m = grid.length, n = grid[0].length;
	    int[] dp = new int[n];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (j == 0) {
	                dp[j] = dp[j];        // 只能从上侧走到该位置
	            } else if (i == 0) {
	                dp[j] = dp[j - 1];    // 只能从左侧走到该位置
	            } else {
	                dp[j] = Math.min(dp[j - 1], dp[j]);
	            }
	            dp[j] += grid[i][j];
	        }
	    }
	    return dp[n - 1];
	}
}
