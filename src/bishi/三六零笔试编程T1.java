package bishi;

import java.util.Scanner;

public class ÈıÁùÁã±ÊÊÔ±à³ÌT1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] times = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			times[i]=sc.nextInt();
		}
		float res = func(n,arr,times);
		System.out.println(String.format("%.3f", res));
		sc.close();
	}

	private static float func(int n, int[] arr, int[] times) {
		return n;
	}

	

}
