package leetcode;

//91½âÂë·½·¨
public class DTGH08 {

	public static int numDecodings(String s) {
		if(s.length()==0||s=="")
			return 0;
		int n = s.length();
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=s.charAt(0)=='0'?0:1;
		for (int i = 2; i <= n; i++) {
			int num1 = Integer.valueOf(s.substring(i-1, i));
			if(num1!=0) {
				dp[i]+=dp[i-1];
			}
			if(s.charAt(i-2)=='0')
				continue;
			int num2 = Integer.valueOf(s.substring(i-2, i));
			if(num2<=26) {
				dp[i]+=dp[i-2];
			}
		}
		return dp[n];
	}

}
