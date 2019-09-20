package bishi;

/*
 * 股票最佳买入时机
 */
public class 三七互娱笔试编程1 {

	public static void main(String[] args) {
		
	}
	//一次循环，动态规划
	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < prices.length; ++i) {
			if (prices[i] < min) {
				min = prices[i];
			} else if (sum < prices[i] - min) {
				sum = prices[i] - min;
			}
		}
		return sum;
	}

}
