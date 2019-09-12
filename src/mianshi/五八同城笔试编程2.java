package mianshi;

import java.util.Scanner;

public class 五八同城笔试编程2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = func(arr);
		System.out.println(res);
		sc.close();
	}

	private static int func(int[] arr) {
		int sum = 0;
		int num = 1;
		int index = arr.length-1;
		if(arr[index]<arr[index-1]) {
			sum+=num;
			for (int i = arr.length - 2; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					num++;
					sum += num;
				} else {
					index = i;
					break;
				}
			}
		}
		

		num =1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				num++;
			else
				break;
		}
		sum += num;
		for (int i = 1; i < index+1; i++) {
			if (arr[i] > arr[i - 1]) {
				num++;
				sum += num;
			} else if (arr[i] < arr[i - 1]) {
				num--;
				sum += num;
			} else {
				sum += num;
			}
			System.out.println(num);
		}
		System.out.println();
		return sum;
	}

}
