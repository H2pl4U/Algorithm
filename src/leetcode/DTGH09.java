package leetcode;

//300最长上升子序列
public class DTGH09 {
	public int lengthOfLIS(int[] nums) {
		if(nums.length==0)
			return 0;
		int[] dp = new int[nums.length];
        dp[0]=1;
		int maxres = 1;
		for (int i = 1; i < dp.length; i++) {
			int maxval = 0;
			for (int j = 0; j < i; j++) {
				if(nums[j]<nums[i]) {
					maxval = Math.max(dp[j], maxval);
				}
			}
			dp[i]=maxval+1;
			maxres = Math.max(maxres, dp[i]);
		}
		return maxres;
	}
	

}
