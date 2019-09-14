package leetcode;


//413数组中等差递增子区间的个数
public class DTGH06 {
	public int numberOfArithmeticSlices(int[] A) {
	    if (A == null || A.length == 0) {
	        return 0;
	    }
	    int n = A.length;
	    int[] dp = new int[n];
	    for (int i = 2; i < n; i++) {
	        if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
	            dp[i] = dp[i - 1] + 1;
	        }
	    }
	    int total = 0;
	    for (int cnt : dp) {
	        total += cnt;
	    }
	    return total;
	}
}
