package bishi;

import java.util.Scanner;

public class 小米模拟笔试编程2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			for(int i=0; i<num; i++) {
				System.out.println(Fan(sc.nextInt()));
			}
		}
	
	}
	public static int Fan(int n) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		if(n == 3) return 2;
		return Fan(n-1)+Fan(n-2);
	}
}
