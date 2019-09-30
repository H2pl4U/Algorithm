package bishi;

import java.util.Scanner;

public class ¶ÈĞ¡Âú±ÊÊÔ±à³Ì1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = {1,2,3,4,5};
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int res = func(n,a);
		System.out.println(res);
		sc.close();
	}

	private static int func(int n, int[] a) {
		int count = 0;
		if(n<4) {
			for (int i = 0; i < n; i++) {
				if(count<a[i])
					count = a[i];
			}
			return count;
		}
		int[] arr = new int[n+1];
		for (int i = 0; i < n; i++) {
			arr[i+1]=a[i];
		}
		for (int i = 1; i <= n; i++) {
			if((2*i)+1<=n) {
				while(arr[i]>0||arr[2*i]>0||arr[2*i+1]>0) {
					arr[i]--;
					arr[2*i]--;
					arr[2*i+1]--;
					count++;
				}
			}else if(2*i<=n) {
				while(arr[i]>0||arr[2*i]>0) {
					arr[i]--;
					arr[2*i]--;
					count++;
				}
			}
		}
		
		return count;
	}
	

}
