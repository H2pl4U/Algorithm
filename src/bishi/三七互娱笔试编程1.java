package bishi;

/*
 * ��Ʊ�������ʱ��
 */
public class ���߻�����Ա��1 {

	public static void main(String[] args) {
		
	}
	//һ��ѭ������̬�滮
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
