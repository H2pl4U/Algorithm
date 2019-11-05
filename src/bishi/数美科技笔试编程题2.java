package bishi;

import java.util.Random;

public class 数美科技笔试编程题2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] dp = new int[1000];
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rand.nextInt(100000);
			dp[arr[i]/100]++;
		}
		int sum = 0;
		for (int i = 0; i < dp.length; i++) {
			System.out.println("["+sum+"-"+(sum+99)+"]"+" "+dp[i]);
			sum+=100;
		}
	}
}
