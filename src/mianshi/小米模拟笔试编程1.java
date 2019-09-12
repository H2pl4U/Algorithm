package mianshi;

import java.util.Scanner;

public class 小米模拟笔试编程1 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tree = new int[n];
		for (int i = 0; i < n; i++)
			tree[i] = -1;
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tree[b] = a;
		}
		int high = 0;
		for (int i = 0; i < n; i++) {
			int max = 1;
			int j = i;
			while (tree[j] != -1) {
				max++;
				j = tree[j];
			}
			high = max > high ? max : high;
		}
		System.out.println(high);
	}

}
