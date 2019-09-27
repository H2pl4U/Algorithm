package bishi;

import java.util.Scanner;

public class ÈıÁùÁã±ÊÊÔ±à³ÌT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		float res = func(N,M,arr);
		System.out.println(res);
		sc.close();
	}

	private static float func(int n, int m, int[] arr) {
		float max = 0;
		for (int i = 0; i < n-m; i++) {
			float avg = 0,sum=0,count=m;
			for (int j = i; j < i+m; j++) {
				sum+=arr[j];
			}
			avg=sum/m;
			for (int j = i+m; j < n; j++) {
				if(arr[j]>avg) {
					avg = (arr[j]+avg*count)/(count+1);
					count++;
				}
			}
			if(max<avg) {
				max=avg;
			}
		}
		return max;
	}

}
